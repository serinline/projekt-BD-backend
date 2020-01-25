package bd.controllers;

import bd.models.Bagaz;
import org.springframework.web.bind.annotation.*;
import bd.repositories.BagazRepository;

import java.util.List;

@CrossOrigin(origins = "https://bd-project-frontend.herokuapp.com")
@RestController
public class BagazController {

    private final
    BagazRepository bagazRepository;

    public BagazController(BagazRepository bagazRepository) {
        this.bagazRepository = bagazRepository;
    }

    @PostMapping(value = "/bagaz", consumes = "application/json", produces = "application/json")
    @ResponseBody
    Bagaz bagaz(@RequestBody Bagaz bagaz) {
        int returnCode = bagazRepository.dodajBagaz(bagaz);
        if(returnCode == 1) {
            return  bagaz;
        }
        return null;
    }

    @DeleteMapping("/usun/bagaz/{bagaz_id}")
    void usunBagaz(@PathVariable Integer bagaz_id){
        bagazRepository.usun(bagaz_id);
    }

    @GetMapping("/bagaze")
    List<Bagaz> wyswietlBagaze() { return bagazRepository.wyswietl();}
}
