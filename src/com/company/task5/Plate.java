package com.company.task5;

public class Plate extends Dish{

    Plate(String type){
        super(type);
    }

    @Override
    public void getForm() {
        System.out.println("Circle");
    }
}
