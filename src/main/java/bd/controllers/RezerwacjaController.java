package bd.controllers;

import bd.models.Pasazer;
import bd.models.Pracownik;
import bd.models.Rezerwacja;
import bd.repositories.RezerwacjaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://bd-project-frontend.herokuapp.com")
@RestController
public class RezerwacjaController {

    private final RezerwacjaRepository rezerwacjaRepository;

    public RezerwacjaController(RezerwacjaRepository rezerwacjaRepository) {
        this.rezerwacjaRepository = rezerwacjaRepository;
    }

    @PostMapping(value = "/rezerwacja", consumes = "application/json", produces = "application/json")
    @ResponseBody
    Long rezerwacja(@RequestBody Rezerwacja rezerwacja) {
            return rezerwacjaRepository.rezerwuj(rezerwacja);
    }

    @GetMapping("/zaloga/{id_lot}")
    List<Pracownik> zaloga(@PathVariable Integer id_lot){
        return rezerwacjaRepository.wypiszZaloge(id_lot);
    }

//    @PutMapping("/miejsca/{msc}/{id}")
//    int zajeteMiejsce(@PathVariable String msc, @PathVariable Integer id){
//        return rezerwacjaRepository.updateMiejsca(msc, id);
//    }

    @PutMapping("/rezerwacjaUpdate/{id_rezerwacja}")
    int dodajBagazDoRezerwacji( @PathVariable Integer id_rezerwacja){
        return rezerwacjaRepository.dodajBagazDoRezerwacji(id_rezerwacja);
    }


    @GetMapping("/rezerwacja/id")
    Integer idRezerwacji(){
        return rezerwacjaRepository.znajdzIdRez();
    }

    @GetMapping("/rezerwacje")
    List<Rezerwacja> rezerwacje(){
        return rezerwacjaRepository.wypiszRezerwacje();
    }

    @GetMapping("/zaloga")
    List<Pracownik> calaZaloga(){
        return rezerwacjaRepository.wypiszCalaZaloge();
    }





}
