package com.company.task6;

public class Animal implements Nameable {
    String name;
    String kind;
    double weight;

    Animal(String name, String kind, double weight){
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }

    public void setRadius(String kind) {
        this.kind = kind;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRadius() {
        return kind;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}
