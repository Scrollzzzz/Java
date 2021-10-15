package com.company.task8;

import java.awt.*;

public class Rectangle extends Shape {

    Rectangle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
