package com.example.oop.methods.exam.stock;

import java.util.List;

public class Broker {

    private String name;
    private List<Stock> stocks;

    public Broker(String name, List<Stock> stocks) {
        this.name = name;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
