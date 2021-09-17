package com.company.task3;

public class CircleFirst {
    private double radius;

    public CircleFirst(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getSquare(){
        return Math.PI*radius*radius;
    }

    public double getCircumference() {return Math.PI*2*radius; }
}
