package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Produit;
import com.example.hamzabenayed.Entities.Stock;
import com.example.hamzabenayed.Repository.ProduitRepository;
import com.example.hamzabenayed.Repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IProduitServiceMP implements IProduitService{
    private final ProduitRepository produitRepository;
    private final StockRepository stockRepository;
    public IProduitServiceMP(ProduitRepository produitRepository, StockRepository stockRepository) {
        this.produitRepository = produitRepository;
        this.stockRepository = stockRepository;
    }

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        Optional<Produit> etudiant = produitRepository.findById(id);
        return etudiant.orElse(null);    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {

        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        if ((produit!=null) && (stock!=null)){
            produit.setStock(stock);
        }
        produitRepository.save(produit);


    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        /*Fournisseur universite = Fournisseur.findById(idUniversite).orElse(null);
        Produit produit = departementRepository.findById(idDepartement).orElse(null);
        if ((departement!=null) && (universite!=null)){
            universite.getDepartement().add(departement);*/

    }





}

