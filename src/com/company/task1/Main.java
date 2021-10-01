package com.company.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum: " + first(mas));
        second(args);
        third();
        fourth();
        Scanner in = new Scanner(System.in);
        System.out.println(fact(in.nextInt()));
    }

    public static int first(int[] mas) {
        int sum = 0;
        for (int n : mas){
            sum+=n;
        }
        return sum;
    }

    public static void second(String[] args) {
        for (String arg : args){
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void third() {
        System.out.print("1");
        for (int i = 2; i <= 10; i++){
            System.out.print(" + 1/" + i);
        }
        System.out.println();
    }

    public static void fourth() {
        int[] mass = new int[20];
        for ( int i = 0; i < mass.length; i++){
            mass[i] = (int)(Math.random()*20);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Arrays.sort(mass);
        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int fact(int n) {
        int res = 1;
        for (; n > 1; n--){
            res*=n;
        }
        return res;
    }
}

