package bd.controllers;

import bd.models.Pasazer;
import bd.repositories.PasazerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasazerController {
    private final
    PasazerRepository pasazerRepository;

    public PasazerController(PasazerRepository pasazerRepository) {
        this.pasazerRepository = pasazerRepository;
    }

    @PostMapping(value = "/pasazer", consumes = "application/json", produces = "application/json")
    @ResponseBody
    Pasazer pasazer(@RequestBody Pasazer pasazer) {
        int returnCode = pasazerRepository.dodajPasazera(pasazer);
        if(returnCode == 1) {
            return pasazer;
        }
        return null;
    }

}
