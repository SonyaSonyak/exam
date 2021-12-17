package com.example.oop.methods.exam.stock;

public class Stock {

    private String firmName;
    private double price;
    private int amount;

    public Stock(String firmName, double price, int amount) {
        this.firmName = firmName;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
