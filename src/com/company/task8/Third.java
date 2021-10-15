package com.company.task8;

import javax.swing.*;

public class Third {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\kiril\\IdeaProjects\\untitled19\\src\\com\\company\\task8\\88.gif");
        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);

        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 243);
        frame.setVisible(true);
        frame.add(jLabel);
    }
}
