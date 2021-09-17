package com.company.task6;

public class Planet implements Nameable{
    String name;
    double radius;
    double weight;

    Planet(String name, double radius, double weight){
        this.name = name;
        this.radius = radius;
        this.weight = weight;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}
