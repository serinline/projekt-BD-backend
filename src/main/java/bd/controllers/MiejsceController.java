package bd.controllers;

import bd.models.Miejsce;
import bd.repositories.MiejsceRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class MiejsceController {
    private final MiejsceRepository miejsceRepository;

    public MiejsceController(MiejsceRepository miejsceRepository) {
        this.miejsceRepository = miejsceRepository;
    }

    @GetMapping("/miejsca/{id_lot}")
    public List<Miejsce> getFree(@PathVariable Integer id_lot){
        return miejsceRepository.znajdzWolne(id_lot);
    }


}
