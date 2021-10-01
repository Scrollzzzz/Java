package com.company.task6;

public class Furniture implements Priceable {
    String type;
    int art;
    double price;

    Furniture(String type, int art, double price){
        this.type = type;
        this.art = art;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setArt(int art) {
        this.art = art;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public int getArt() {
        return art;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
