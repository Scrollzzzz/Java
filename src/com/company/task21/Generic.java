package com.company.task21;

import java.util.Arrays;
import java.util.List;

public class Generic {

    private final List<String> list = Arrays.asList("", "Сокольническая", "Замоскворецкая", "Арбатско-Покровская", "Филевская", "Кольцевая",
            "Калужско-Рижская", "Таганско-Краснопресненская", "Калининская", "Серпуховско-Тимирязевская", "Люблинско-Дмитровская",
            "Каховская", "Бутовская", "Московская монорельсовая транспортная система", "Московское центральное кольцо",
            "Некрасовская", "Большая кольцевая", "МЦД-1 «Лобня — Одинцово»", "МЦД-2 «Нахабино — Подольск»");

    public void printList(boolean t){
        if (t) {
            for (String s : list)
                if (list.indexOf(s)%2 == 1)
                    System.out.println(s);
            return;
        }
        for (String s : list)
            if (list.indexOf(s)%2 == 0)
                System.out.println(s);
    }

    public static void main(String[] args) {
        new Generic().printList(false);
    }
}
