package com.example.hamzabenayed.Service;

import com.example.hamzabenayed.Entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);

}
