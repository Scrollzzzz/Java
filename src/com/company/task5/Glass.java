package com.company.task5;

public class Glass extends Dish{

    Glass(String type){
        super(type);
    }

    @Override
    public void getForm() {
        System.out.println("Square");
    }
}
