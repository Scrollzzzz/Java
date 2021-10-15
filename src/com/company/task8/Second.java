package com.company.task8;

import javax.swing.*;

public class Second {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(args[0]);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);

        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(660, 710);
        frame.setVisible(true);
        frame.add(jLabel);
    }
}
