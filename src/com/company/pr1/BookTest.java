package com.company.pr1;

import com.company.pr1.Book;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("ttt", "rrr", 52);
        System.out.println(book);
        book.setAuthor("qqq");
        book.setName("www");
        book.setPages(102);
        System.out.println(book);
    }
}
