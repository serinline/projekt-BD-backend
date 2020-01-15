package bd.controllers;

import bd.models.Pasazer;
import bd.repositories.PasazerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://bd-project-frontend.herokuapp.com")
@RestController
public class PasazerController {
    private final
    PasazerRepository pasazerRepository;

    public PasazerController(PasazerRepository pasazerRepository) {
        this.pasazerRepository = pasazerRepository;
    }

    @PostMapping(value = "/pasazer", consumes = {"application/json"}, produces = "application/json")
    @ResponseBody
    Pasazer pasazer(@RequestBody Pasazer pasazer) {
        int returnCode = pasazerRepository.dodajPasazera(pasazer);
        if(returnCode == 1) {
            return pasazer;
        }
        return null;
    }

    @GetMapping("/pasazer/id")
    public Integer znajdzId(){
        return pasazerRepository.znajdzId();
    }

    @DeleteMapping("/usun/pasazer/{pasazer_id}")
    void usunBagaz(@PathVariable Integer pasazer_id){
        pasazerRepository.usun(pasazer_id);
    }


    @GetMapping("/pasazerowie")
    List<Pasazer> znajdzWszystkich(){
        return pasazerRepository.wypiszWszystkich();
    }

}
