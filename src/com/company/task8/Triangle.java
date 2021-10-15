package com.company.task8;

import java.awt.*;

public class Triangle extends Shape {
    Triangle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
