package com.company.task3;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("ttt", "rrr", 1856);
        System.out.println(book);
        book.setAuthor("qqq");
        book.setName("www");
        book.setYear(1894);
        System.out.println(book);
    }
}
