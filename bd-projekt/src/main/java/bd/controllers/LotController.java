package bd.controllers;

import bd.repositories.LotRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LotController {
    private final LotRepository lotRepository;

    public LotController(LotRepository lotRepository) {
        this.lotRepository = lotRepository;
    }

}
