package com.company.task8;

import java.awt.*;

public abstract class Shape {
    int x;
    int y;
    Color color;

    Shape(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Color getColor() {
        return color;
    }

    public abstract String getType();
}
