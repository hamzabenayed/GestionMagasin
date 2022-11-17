package com.example.hamzabenayed.Controllers;

import com.example.hamzabenayed.Entities.Client;
import com.example.hamzabenayed.Entities.Facture;
import com.example.hamzabenayed.Service.IClientService;
import com.example.hamzabenayed.Service.IFactureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final IClientService iClientService;
    private final IFactureService iFactureService;

    public ClientController(IClientService iClientService, IFactureService iFactureService) {
        this.iClientService = iClientService;
        this.iFactureService = iFactureService;
    }
    @GetMapping()
    List<Client> findall() {

        return iClientService.retrieveAllClients();
    }

    @PostMapping()
    Client addClient(@RequestBody Client client) {
        return iClientService.addClient(client);
    }
    @DeleteMapping("/{idClient}")
    void deleteClient(@PathVariable long idClient) {
        iClientService.deleteClient(idClient);
    }


    @PutMapping()
    Client updateClient(@RequestBody Client client) {
        return this.iClientService.updateClient(client);
    }

    @GetMapping("/{idClient}")
    Client getClient(@PathVariable long idClient){
        return iClientService.retrieveClient(idClient);
    }

    @GetMapping("/clt/{idClient}")
    public List<Facture> getFactureByClient(@PathVariable long idClient) {
        return iClientService.getFacturesByClient(idClient);
    }
}
