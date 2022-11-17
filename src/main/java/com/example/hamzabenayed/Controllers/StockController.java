package com.example.hamzabenayed.Controllers;

import com.example.hamzabenayed.Entities.Facture;
import com.example.hamzabenayed.Entities.Stock;
import com.example.hamzabenayed.Service.IStockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    private final IStockService iStockService;

    public StockController(IStockService iStockService) {
        this.iStockService = iStockService;
    }


    @GetMapping()
    List<Stock> findall() {

        return iStockService.retrieveAllStocks();
    }
    @GetMapping("/{idStock}")
    Stock getStock(@PathVariable long idStock){
        return iStockService.retrieveStock(idStock);
    }


}
