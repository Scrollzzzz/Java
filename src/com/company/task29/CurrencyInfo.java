package com.company.task29;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    String name;
    int courseD;
    ArrayList<String> countries = new ArrayList<>();

    public CurrencyInfo(String name, int courseD, ArrayList<String> countries){
        this.name = name;
        this.courseD = courseD;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public int getCourseD() {
        return courseD;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void addCountry(String country){
        countries.add(country);
    }

    public void removeCountry(String country){
        countries.remove(country);
    }

    public void setCourseD(int courseD){
        this.courseD = courseD;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "name='" + name + '\'' +
                ", courseD=" + courseD +
                ", countries=" + countries +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo usdT = new CurrencyInfo("USDT", 1, new ArrayList<String>(Arrays.asList("USA", "Germany", "Australia", "Russia")));
        System.out.println(usdT);

        FileOutputStream outputStream = new FileOutputStream("src/com/company/task29/save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(usdT);
        objectOutputStream.close();

        usdT = null;

        FileInputStream fileInputStream = new FileInputStream("src/com/company/task29/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        usdT = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(usdT);
    }
}
