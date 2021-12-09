package com.company.task20;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: YYYY MM DD HH MI: ");
        int year = in.nextInt();
        int month = in.nextInt() - 1;
        int day = in.nextInt();
        int hour = in.nextInt();
        int min = in.nextInt();
        System.out.println("Dunaev Kirill\nDate of receiving: " + new GregorianCalendar(year, month , day, hour, min).getTime() + "\nDelivery of work: " + new Date());
    }
}
