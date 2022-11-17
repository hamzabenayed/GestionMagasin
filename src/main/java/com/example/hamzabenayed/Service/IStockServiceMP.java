package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Fournisseur;
import com.example.hamzabenayed.Entities.Stock;
import com.example.hamzabenayed.Repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class IStockServiceMP implements  IStockService{
    private final StockRepository stockRepository;

    public IStockServiceMP(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepository.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        Optional<Stock> etudiant = stockRepository.findById(id);
        return etudiant.orElse(null);    }


}
  /*  private final ClientRepository clientRepository;

    public IClientServiceMP(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
          }

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
}*/
