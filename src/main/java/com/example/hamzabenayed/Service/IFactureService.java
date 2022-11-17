package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}
