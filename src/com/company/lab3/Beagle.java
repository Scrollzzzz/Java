package com.company.lab3;

public class Beagle extends Dog {

    public Beagle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Beagle";
    }
}
