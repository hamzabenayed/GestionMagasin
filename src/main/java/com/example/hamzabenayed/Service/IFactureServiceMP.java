package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Facture;
import com.example.hamzabenayed.Repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IFactureServiceMP implements IFactureService{
    private final FactureRepository factureRepository;

    public IFactureServiceMP(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(Long id) {
        Optional<Facture> etudiant = factureRepository.findById(id);
        return etudiant.orElse(null);    }
}
