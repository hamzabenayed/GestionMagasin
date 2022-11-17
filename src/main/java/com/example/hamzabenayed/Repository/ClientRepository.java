package com.example.hamzabenayed.Repository;

import com.example.hamzabenayed.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long>  {
}
