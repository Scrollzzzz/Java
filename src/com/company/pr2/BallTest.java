package com.company.pr2;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball(0, 0);
        System.out.println(ball);
        ball.move(1, 2);
        System.out.println(ball);
    }
}

