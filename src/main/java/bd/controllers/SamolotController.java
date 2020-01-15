package bd.controllers;

import bd.models.Samolot;
import bd.repositories.SamolotRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://bd-project-frontend.herokuapp.com")
@RestController
public class SamolotController {
    private final SamolotRepository samolotRepository;

    public SamolotController(SamolotRepository samolotRepository) {
        this.samolotRepository = samolotRepository;
    }

    @GetMapping("/samolot/{id}")
    List<Samolot> find(@PathVariable Integer id){
        return samolotRepository.znajdzPoId(id);
    }
}
