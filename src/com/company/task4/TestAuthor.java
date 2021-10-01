package com.company.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("rty", "fruheig@gmaim.ru", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setEmail("ejrgherug@gmail.ru");
        System.out.println(author);
    }
}
