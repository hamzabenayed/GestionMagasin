package com.example.hamzabenayed.Repository;

import com.example.hamzabenayed.Entities.Client;
import com.example.hamzabenayed.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    float summontant_factureAndmontant_remise(long idFacture);
    float summontant_remiseAndprix_total(long idFacture);

    List<Facture> findByClientidClient(long idClient);

}
