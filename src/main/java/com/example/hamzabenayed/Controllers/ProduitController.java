package com.example.hamzabenayed.Controllers;

import com.example.hamzabenayed.Entities.Produit;
import com.example.hamzabenayed.Service.IProduitService;
import com.example.hamzabenayed.Service.IStockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
private final IProduitService produitService;
private final IStockService iStockService;

    public ProduitController(IProduitService produitService, IStockService iStockService) {
        this.produitService = produitService;
        this.iStockService = iStockService;
    }


    @GetMapping()
    List<Produit> findall() {

        return produitService.retrieveAllProduits();
    }

    @GetMapping("/{idProduit}")
    Produit getProduit(@PathVariable long idProduit){
        return produitService.retrieveProduit(idProduit);
    }


    @PutMapping("/{produitId}/{stockId}")
    void assignProduitToStock(@PathVariable long produitId, @PathVariable long stockId) {
        produitService.assignProduitToStock( produitId, stockId);
    }



}

