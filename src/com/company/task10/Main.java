package com.company.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println(second(59));
        System.out.println(fifth(999));

    }


    public static String second(int n){
        if(n == 1)
            return "1";
        else {
            return second(--n) + ' ' + String.valueOf(n+1);
        }
    }

    public static int fifth(int n){
        if(n < 10)
            return n;
        else {
            return n%10 + fifth(n/10);
        }
    }
}
