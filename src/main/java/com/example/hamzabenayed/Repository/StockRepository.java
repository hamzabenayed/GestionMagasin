package com.example.hamzabenayed.Repository;

import com.example.hamzabenayed.Entities.Client;
import com.example.hamzabenayed.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
