package com.company.task23;

import java.util.Arrays;
import java.util.List;

public class Hash {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("string1", "car", "cаr", "AaAaAa", "AaAaBB");

        for (int i = 0; i < list.size(); i++){
            for (int j = i; j < list.size(); j++){
                String s1 = list.get(i);
                String s2 = list.get(j);
                System.out.println(s1 + " | " + s2 + "\nare equal? : " + s1.equals(s2) + "\nare hash equal? : " +
                        (s1.hashCode() == s2.hashCode()) + "\ns1 hash: " + s1.hashCode() + "\ns2 hash: " + s2.hashCode() + "\n");
            }
        }
    }
}
