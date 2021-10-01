package com.company.task5;

public class Beagle extends Dog {

    public Beagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void getBreed() {
        System.out.println("Beagle");
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Beagle";
    }
}
