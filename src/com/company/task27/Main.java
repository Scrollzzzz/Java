package com.company.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Шершуков", "Виктор");
        map.put("Битова", "Анастасия");
        map.put("Кириллов", "Александр");
        map.put("Игнатьев", "Игорь");
        map.put("Самохвалова", "Наталия");
        map.put("Павлова", "Анастасия");
        map.put("Баршев", "Андрей");
        map.put("Оверченков", "Захар");
        map.put("Герасимов", "Александр");
        map.put("Леденева", "Софья");

        System.out.println(map);

        List<String> keys = new ArrayList<>(map.keySet());
        List<String> values = new ArrayList<>(map.values());
        for (int i = 0; i < values.size(); i++){
            boolean t = false;
            for (int j = i + 1; j < values.size(); j++){
                if ((values.get(i).equals(values.get(j)))) {
                    map.remove(keys.get(j), values.get(j));
                    values.remove(j);
                    keys.remove(j);
                    j--;
                    t = true;
                }
            }
            if (t) {
                map.remove(keys.get(i), values.get(i));
            }
        }

        System.out.println(map);
    }
}
