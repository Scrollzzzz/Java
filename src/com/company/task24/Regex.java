package com.company.task24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private final String regex = "^(([1]\\d{2}|[2]((0|1|2|3|4)\\d|[5](0|1|2|3|4|5))|\\d{1,2})[.]){3}([1]\\d{2}|[2]((0|1|2|3|4)\\d|[5](0|1|2|3|4|5))|\\d{1,2})";
    private final Pattern pattern = Pattern.compile(regex);

    public boolean isIP(String ip) {
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Regex regex = new Regex();
        String ip = in.next();
        while(!ip.equals("end")){
            System.out.println(ip +" : "+ regex.isIP(ip));
            ip = in.next();
        }
    }
}
