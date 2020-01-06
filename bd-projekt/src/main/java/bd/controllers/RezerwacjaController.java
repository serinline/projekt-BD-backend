package bd.controllers;

import bd.models.Pasazer;
import bd.models.Pracownik;
import bd.models.Rezerwacja;
import bd.repositories.RezerwacjaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RezerwacjaController {

    private final RezerwacjaRepository rezerwacjaRepository;

    public RezerwacjaController(RezerwacjaRepository rezerwacjaRepository) {
        this.rezerwacjaRepository = rezerwacjaRepository;
    }

    @PostMapping(value = "/rezerwacja", consumes = "application/json", produces = "application/json")
    @ResponseBody
    Rezerwacja rezerwacja(@RequestBody Rezerwacja rezerwacja) {
        int returnCode = rezerwacjaRepository.rezerwuj(rezerwacja);
        if(returnCode == 1) {
            return rezerwacja;
        }
        return null;
    }

    @GetMapping("/zaloga/{id}")
    List<Pracownik> zaloga(@PathVariable Integer id){
        return rezerwacjaRepository.wypiszZaloge(id);
    }

    @PutMapping("/miejsca/{msc}/{id}")
    int zajeteMiejsce(@PathVariable String msc, @PathVariable Integer id){
        return rezerwacjaRepository.updateMiejsca(msc, id);
    }
}
