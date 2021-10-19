package com.company.task11;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger r = new AtomicInteger((int)(Math.random()*21));
        AtomicInteger q = new AtomicInteger();
        JFrame frame = new JFrame();
        frame.setTitle("Task 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout layout = new SpringLayout();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(layout);

        JLabel label1 = new JLabel("Угадайте число между 0 и 20");
        JLabel label2 = new JLabel();
        JTextField text1 = new JTextField(2);
        text1.setFont(new Font("Times new Roman", Font.BOLD, 20));
        JButton but1 = new JButton("Угадать");

        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(text1);
        contentPane.add(but1);

        but1.addActionListener(e -> {
            if (Integer.parseInt(text1.getText()) == r.get()){
                label2.setText("Win!");
                q.set(0);
                r.set((int)(Math.random()*21));
            }
            else {
                q.getAndIncrement();
                System.out.println(q);
                label2.setText("No");
            }
            if (q.get() == 3){
                label2.setText("Game Over! Try again.");
                q.set(0);
                r.set((int)(Math.random()*21));
            }
        });

        layout.putConstraint(SpringLayout.WEST , label1, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 10, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST , text1, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, text1, 20, SpringLayout.SOUTH, label1);

        layout.putConstraint(SpringLayout.WEST , but1, 10, SpringLayout.EAST , text1);
        layout.putConstraint(SpringLayout.NORTH, but1, 0, SpringLayout.NORTH, text1);
        layout.putConstraint(SpringLayout.SOUTH, but1, 0, SpringLayout.SOUTH, text1);

        layout.putConstraint(SpringLayout.WEST , label2, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label2, 20, SpringLayout.SOUTH, text1);

        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
