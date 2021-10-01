package com.company.task5;

public class Bed extends Furniture{
    Bed(String type){
        super(type);
    }

    @Override
    public void room() {
        System.out.println("Bedroom");
    }
}
