package com.example.hamzabenayed.Controllers;

import com.example.hamzabenayed.Entities.Facture;
import com.example.hamzabenayed.Service.IFactureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    private final IFactureService iFactureService;

    public FactureController(IFactureService iFactureService) {
        this.iFactureService = iFactureService;
    }

    @GetMapping()
    List<Facture> findall() {

        return iFactureService.retrieveAllFactures();
    }

    @GetMapping("/{idFacture}")
    Facture getFacture(@PathVariable long idFacture){
        return iFactureService.retrieveFacture(idFacture);
    }
}

