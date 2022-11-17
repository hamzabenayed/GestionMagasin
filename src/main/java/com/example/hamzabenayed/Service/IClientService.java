package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Client;
import com.example.hamzabenayed.Entities.Facture;

import java.util.List;

public interface IClientService {

    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
    List<Facture> getFacturesByClient(Long idClient);
}
