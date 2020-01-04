package bd.controllers;

import bd.models.Samolot;
import bd.repositories.SamolotRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SamolotController {
    private final SamolotRepository samolotRepository;

    public SamolotController(SamolotRepository samolotRepository) {
        this.samolotRepository = samolotRepository;
    }

    @GetMapping("/samolot")
    List<Samolot> find(Integer id){
        return samolotRepository.znajdzPoId(id);
    }
}
