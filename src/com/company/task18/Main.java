package com.company.task18;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Map<Integer, String> data = new HashMap<>();
        data.put(1905019765, "Николаев Арсений Макарович");
        data.put(1438738343, "Мартынов Лев Константинович");
        data.put(1965234259, "Тихонова София Фёдоровна");
        data.put(1537839345, "Андреев Егор Михайлович");
        data.put(1394934636, "Муравьев Максим Кириллович");
        data.put(1982423439, "Леонов Станислав Михайлович");
        data.put(1869888627, "Осипова Мария Андреевна");
        data.put(1154318527, "Сычев Даниил Тимурович");

        System.out.print("ФИО: ");
        String name = in.nextLine();

        System.out.print("ИНН: ");
        int inn = in.nextInt();

        if (data.get(inn) == null || !data.get(inn).equals(name))
            throw new Exception("Недействительный ИНН");
        System.out.println("Действительный ИНН");
    }
}
