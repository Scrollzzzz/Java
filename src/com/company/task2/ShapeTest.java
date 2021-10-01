package com.company.task2;

public class ShapeTest {
    public static void main(String[] args){
        Shape shape = new Shape("Circle", "red", true);
        System.out.println(shape);
        shape.setType("Rectangle");
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println(shape);
    }
}
