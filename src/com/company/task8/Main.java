package com.company.task8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        Panel panel = new Panel();
        frame.add(panel);
        frame.pack();
        frame.setTitle("Task 8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
