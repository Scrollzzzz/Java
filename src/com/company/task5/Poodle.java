package com.company.task5;

public class Poodle extends Dog {

    public Poodle(String name, int age) {
        super(name, age);
    }

    @Override
    public void getBreed() {
        System.out.println("Poodle");
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Poodle";
    }
}
