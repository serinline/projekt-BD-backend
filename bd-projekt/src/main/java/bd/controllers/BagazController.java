package bd.controllers;

import bd.models.Bagaz;
import org.springframework.web.bind.annotation.*;
import bd.repositories.BagazRepository;

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
}
