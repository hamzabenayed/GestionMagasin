package com.example.hamzabenayed.Repository;

import com.example.hamzabenayed.Entities.Produit;
import com.example.hamzabenayed.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
