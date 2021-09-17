package com.company.task6;

public class TestName {
    public static void main(String[] args){
        Planet earth = new Planet("Earth", 6371, 946521546);
        Animal dog = new Animal("Dog", "Corgi", 7);

        System.out.println(earth.getName());
        System.out.println(dog.getName());
    }
}
