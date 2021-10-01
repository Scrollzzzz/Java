package com.company.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(ten(123456789));
        //System.out.println(eleven());
        //twelve();
        //thirteen();
        five(12345);
    }

    public static int one(int n) {
        if (n < 10)
            return n;
        else {
            return n%10*(int)(Math.pow(10, (int)Math.log10(n))) + one(n/10);
        }
    }

    public static int two(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return switch (n) {
            case 1 -> 1 + two();
            case 0 -> twoHelp();
            default -> two();
        };
    }

    public static int twoHelp(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return switch (n) {
            case 1 -> 1 + two();
            case 0 -> 0;
            default -> two();
        };
    }

    public static void three(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if (s == 0) {
            return;
        }
        else
            if (s%2 == 1){
                three();
                System.out.print(s + " ");
            }
            else three();
    }

    public static void four() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if (s == 0)
            return;
        fourHelp();
        System.out.println(s);
    }

    public static void fourHelp(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if (s ==0)
            return;
        four();
    }

    public static void five(int n){
        if (n < 10){
            System.out.print(n);
        }
        else{
            System.out.print(n/(int)(Math.pow(10, (int)Math.log10(n))) + " ");
            five(n%(int)(Math.pow(10, (int)Math.log10(n))));
        }
    }


}
