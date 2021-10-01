package com.company.task5;

public class Corgi extends Dog {

    public Corgi(String name, int age) {
        super(name, age);
    }

    @Override
    public void getBreed() {
        System.out.println("Corgi");
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Corgi";
    }
}
