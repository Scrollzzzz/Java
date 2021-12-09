package com.company.task27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class City {

    private final String city;
    private final String country;

    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args) {
        City moscow = new City("Moscow", "Russia");
        City tomsk = new City("Tomsk", "Russia");
        City novgorod = new City("Novgorod", "Russia");
        City new_York = new City("New York", "USA");
        City washington = new City("Washington", "USA");
        City los_Angeles = new City("Los-Angeles", "USA");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(moscow.country, new ArrayList<>(Arrays.asList(moscow.city, tomsk.city, novgorod.city)));
        map.put(washington.country, new ArrayList<>(Arrays.asList(new_York.city, washington.city, los_Angeles.city)));
        System.out.println(map);
    }
}
