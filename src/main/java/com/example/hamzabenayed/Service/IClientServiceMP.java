package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Client;
import com.example.hamzabenayed.Entities.Facture;
import com.example.hamzabenayed.Repository.ClientRepository;
import com.example.hamzabenayed.Repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class IClientServiceMP implements  IClientService {
    private final ClientRepository clientRepository;
    private final FactureRepository factureRepository;

    public IClientServiceMP(ClientRepository clientRepository, FactureRepository factureRepository) {
        this.clientRepository = clientRepository;
        this.factureRepository = factureRepository;
    }

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {

        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        Optional<Client> etudiant = clientRepository.findById(id);
        return etudiant.orElse(null);    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.findByClientidClient(idClient);
    }
}
