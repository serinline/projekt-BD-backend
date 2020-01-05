package bd.controllers;

import bd.models.Lot;
import bd.repositories.LotRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LotController {
    private final LotRepository lotRepository;


    public LotController(LotRepository lotRepository) {
        this.lotRepository = lotRepository;
    }

    @GetMapping("/lot")
    List<Lot> all(){
        return lotRepository.wypiszWszystkie();
    }

    @GetMapping("/wylot/{miasto}")
    List<Lot> poWylocie(@PathVariable String miasto){
        return lotRepository.znajdzPoWylocie(miasto);
    }

    @GetMapping("/przylot/{miasto}")
    List<Lot> poPrzylocie(@PathVariable String miasto){
        return lotRepository.znajdzPoPrzylocie(miasto);
    }

    @GetMapping("/lot/{miasto1}/{miasto2}")
    List<Lot> poWylociePrzylocie(@PathVariable String miasto1, @PathVariable String miasto2){
        return lotRepository.znajdzPoPrzylocieWylocie(miasto1, miasto2);
    }



}
