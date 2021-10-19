package com.company.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Third {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Task 11");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpringLayout layout = new SpringLayout();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(layout);

        JTextField text1 = new JTextField(30);
        text1.setText("Enter");
        text1.setFont(new Font("Times new Roman", Font.PLAIN, 20));
        contentPane.add(text1);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Color");
        JMenuItem black = new JMenuItem("Black");
        black.addActionListener(e -> text1.setForeground(Color.BLACK));
        JMenuItem red = new JMenuItem("Red");
        red.addActionListener(e -> text1.setForeground(Color.RED));
        JMenuItem green = new JMenuItem("Green");
        green.addActionListener(e -> text1.setForeground(Color.GREEN));
        colorMenu.add(black);
        colorMenu.add(red);
        colorMenu.add(green);

        JMenu fontMenu = new JMenu("Font");
        JMenuItem tnr = new JMenuItem("Times new Roman");
        tnr.addActionListener(e -> {text1.setFont(new Font("Times new Roman", Font.PLAIN, 20));});
        JMenuItem arial = new JMenuItem("Arial");
        arial.addActionListener(e -> {text1.setFont(new Font("Arial", Font.PLAIN, 20));});
        JMenuItem monospaced = new JMenuItem("Monospaced");
        monospaced.addActionListener(e -> {text1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));});
        fontMenu.add(tnr);
        fontMenu.add(arial);
        fontMenu.add(monospaced);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        layout.putConstraint(SpringLayout.WEST , text1, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, text1, 50, SpringLayout.NORTH, contentPane);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
