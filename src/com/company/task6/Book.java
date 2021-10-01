package com.company.task6;

public class Book implements Priceable {
    String name;
    String author;
    double price;

    Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
