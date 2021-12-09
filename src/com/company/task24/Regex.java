package com.company.task24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String regex = "^(([1]\\d{2}|[2]((0|1|2|3|4)\\d|[5](0|1|2|3|4|5))|\\d{1,2})[.]){3}([1]\\d{2}|[2]((0|1|2|3|4)\\d|[5](0|1|2|3|4|5))|\\d{1,2})";
        Pattern pattern = Pattern.compile(regex);

        String ip = in.next();
        while(!ip.equals("end")){
            Matcher matcher = pattern.matcher(ip);
            System.out.println(ip +" : "+ matcher.matches());
            ip = in.next();
        }
    }
}
