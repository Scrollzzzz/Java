package com.company.lab3;

public class Poodle extends Dog {

    public Poodle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Poodle";
    }
}
