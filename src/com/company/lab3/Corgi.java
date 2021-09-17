package com.company.lab3;

public class Corgi extends Dog {

    public Corgi(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Corgi";
    }
}
