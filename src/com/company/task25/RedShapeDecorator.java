package com.company.task25;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        System.out.print("Red ");
        shape.draw();
    }

    private void setRedBorder(){
        System.out.println("Red border set");
    }
}
