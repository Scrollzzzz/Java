package com.company.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(ten(123456789));
        twelve();
    }

    public static int ten(int n) {
        if (n < 10)
            return n;
        else {
            return n%10*(int)(Math.pow(10, (int)Math.log10(n))) + ten(n/10);
        }
    }

    public static void twelve(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if (s == 0) {
            return;
        }
        else {
            if (s%2 == 1)
                System.out.println(s);
            twelve();
        }
    }
}
