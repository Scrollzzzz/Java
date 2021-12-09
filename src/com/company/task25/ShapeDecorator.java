package com.company.task25;

public class ShapeDecorator implements Shape{
    public Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
