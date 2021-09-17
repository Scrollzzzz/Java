package com.company.pr1;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book (String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return name;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAuthor: " + author + "\nPages: " + pages;
    }
}
