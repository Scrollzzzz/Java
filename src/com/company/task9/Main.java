package com.company.task9;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Task 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout layout = new SpringLayout();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(layout);
        JButton but1 = new JButton("Milan");
        JButton but2 = new JButton("Madrid");
        JTextArea res = new JTextArea("Result: 0 X 0");
        JTextArea score = new JTextArea("Last Score: N/A");
        JTextArea winner = new JTextArea("Winner: DRAW");
        contentPane.add(res);
        contentPane.add(score);
        contentPane.add(winner);
        contentPane.add(but1);
        contentPane.add(but2);

        but1.addActionListener(e -> {
            if(!winner.getText().substring(8, 12).equals("DRAW")){
                res.setText("Result: 0 X 0");
                winner.setText("Winner: DRAW");
            }
            String t = res.getText();
            int r1 = Integer.parseInt(t.substring(8, 9));
            int r2 = Integer.parseInt(t.substring(12, 13));
            t = "Result: " + ++r1 + " X " + r2;
            res.setText(t);
            score.setText("Last score: Milan");
            if(r1 == 5)
                winner.setText("Winner: Milan");
        });

        but2.addActionListener(e -> {
            if(!winner.getText().substring(8, 12).equals("DRAW")){
                res.setText("Result: 0 X 0");
                winner.setText("Winner: DRAW");
            }
            String t = res.getText();
            int r1 = Integer.parseInt(t.substring(8, 9));
            int r2 = Integer.parseInt(t.substring(12, 13));
            t = "Result: " + r1 + " X " + ++r2;
            res.setText(t);
            score.setText("Last score: Madrid");
            if(r2 == 5)
                winner.setText("Winner: Madrid");
        });

        layout.putConstraint(SpringLayout.WEST , res, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, res, 10, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST , score, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH , score, 10, SpringLayout.SOUTH , res);

        layout.putConstraint(SpringLayout.WEST , winner, 10, SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH , winner, 10, SpringLayout.SOUTH , score);

        layout.putConstraint(SpringLayout.EAST , but2, -10, SpringLayout.EAST , contentPane);
        layout.putConstraint(SpringLayout.SOUTH , but2, -10, SpringLayout.SOUTH , contentPane);

        layout.putConstraint(SpringLayout.EAST , but1, -10, SpringLayout.WEST , but2);
        layout.putConstraint(SpringLayout.SOUTH , but1, -10, SpringLayout.SOUTH , contentPane);

        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
