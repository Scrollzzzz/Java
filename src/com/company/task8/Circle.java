package com.company.task8;

import java.awt.*;

public class Circle extends Shape{
    Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
