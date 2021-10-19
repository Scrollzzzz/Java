package com.company.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Second {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Task 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        BorderLayout layout = new BorderLayout();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(layout);

        Button east = new Button("East");
        contentPane.add(east, BorderLayout.EAST);
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to East"); }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        Button west = new Button("West");
        contentPane.add(west, BorderLayout.WEST);
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to West"); }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        Button north = new Button("North");
        contentPane.add(north, BorderLayout.NORTH);
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to North"); }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        Button south = new Button("South");
        contentPane.add(south, BorderLayout.SOUTH);
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to South"); }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        Button center = new Button("Center");
        contentPane.add(center, BorderLayout.CENTER);
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "Welcome to Center"); }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        frame.setVisible(true);
    }
}
