package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(fact(in.nextInt()));
    }

    public static int fact(int n) {
        int res = 1;
        for (; n > 1; n--){
            res*=n;
        }
        return res;
    }
}

