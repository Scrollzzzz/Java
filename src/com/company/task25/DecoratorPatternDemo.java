package com.company.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

    }
}
