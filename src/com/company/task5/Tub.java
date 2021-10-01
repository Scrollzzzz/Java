package com.company.task5;

public class Tub extends Furniture{
    Tub(String type){
        super(type);
    }

    @Override
    public void room() {
        System.out.println("Bathroom");
    }
}
