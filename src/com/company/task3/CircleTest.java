package com.company.task3;

public class CircleTest {
    public static void main(String[] args){
        CircleFirst circle = new CircleFirst(2);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Circumference: " + circle.getCircumference());
        circle.setRadius(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
