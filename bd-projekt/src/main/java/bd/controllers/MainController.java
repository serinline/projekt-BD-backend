package bd.controllers;

import bd.models.Bagaz;
import org.springframework.web.bind.annotation.*;
import bd.repositories.BagazRepository;

@RestController
public class MainController {

    private final
    BagazRepository bagazRepository;

    public MainController(BagazRepository bagazRepository) {
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

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello there!";
    }

}
