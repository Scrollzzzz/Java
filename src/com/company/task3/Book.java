package com.company.task3;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return name;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAuthor: " + author + "\nYear: " + year;
    }
}
