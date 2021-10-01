package com.company.task5;

public abstract class Dish {

    private String type;

    Dish(String type){
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void getForm();
}
