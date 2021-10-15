package com.company.task8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Panel extends JPanel {

    ArrayList<Shape> shapes = new ArrayList<>();

    Panel(){
        setPreferredSize(new Dimension(1500, 800));
        create();
    }

    public void paint (Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        for(Shape shape: shapes){
            g2D.setPaint(shape.color);
            switch (shape.getType()) {
                case "Rectangle" -> g2D.fillRect(shape.x, shape.y, 100, 100);
                case "Circle" -> g2D.fillOval(shape.x, shape.y, 100, 100);
                case "Triangle" -> {
                    int[] xs = {shape.x, shape.x + 50, shape.x + 100};
                    int[] ys = {shape.y + 100, shape.y, shape.y + 100};
                    g2D.fillPolygon(xs, ys, 3);
                }
            }
        }
    }

    private void create(){
        for (int i = 0; i < 20; i++) {
            int r = new Random().nextInt(3);
            Shape shape = switch (r) {
                case 0 -> new Rectangle(i%5 * 300, (i / 5) * 200, randomColor());
                case 1 -> new Circle(i%5 * 300, (i / 5) * 200, randomColor());
                case 2 -> new Triangle(i%5 * 300, (i / 5) * 200, randomColor());
                default -> throw new IllegalStateException("Unexpected value: " + r);
            };
            shapes.add(shape);
        }
    }

    private Color randomColor(){
        int r = new Random().nextInt(256);
        int g = new Random().nextInt(256);
        int b = new Random().nextInt(256);
        return new Color(r, g, b);
    }
}
