package com.company.lab3;

import com.company.lab3.Dog;

public class Poodle extends Dog {

    public Poodle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog:\nName: " + getName() + "\nAge: " + getAge() + "\nBreed: Poodle";
    }
}
