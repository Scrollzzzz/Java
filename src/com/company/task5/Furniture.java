package com.company.task5;

public abstract class Furniture {
    private String type;

    Furniture(String type){
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void room();
}
