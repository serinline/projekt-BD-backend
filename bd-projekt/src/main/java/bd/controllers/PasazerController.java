package bd.controllers;

import bd.models.Pasazer;
import bd.repositories.PasazerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/pasazer/pesel")
    public List<Pasazer> zanajdzId(@PathVariable Integer pesel){
        return pasazerRepository.zanajdzId(pesel);
    }



}
