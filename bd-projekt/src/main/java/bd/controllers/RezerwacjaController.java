package bd.controllers;

import bd.models.Pasazer;
import bd.models.Rezerwacja;
import bd.repositories.RezerwacjaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
