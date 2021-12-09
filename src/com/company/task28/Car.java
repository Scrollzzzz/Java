package com.company.task28;

public class Car {
    private final String model;
    private final int year;
    private final int price;
    private final Engine engine;

    public Car(Engine engine, String model, int year, int price){
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }

    public void info() {
        System.out.println("Car:\nModel: " + model + "\nYear: " + year + "\nPrice: " + price + "\nEngine: \nType: " + engine.type + "\nHorsepower: " + engine.horsepower);
    }

    private static class Engine {
        private final String type;
        private final int horsepower;

        public Engine(String type, int horsepower){
            this.type = type;
            this.horsepower = horsepower;
        }
    }

    public static void main(String[] args) {
        Car tesla = new Car(new Engine("electrical", 778), "Tesla", 2020, 150000);
        tesla.info();
        Car tesla2 = new Car(new Engine("electrical", 548), "Tesla", 2018, 0){
            @Override
            public void info() {
                System.out.println("Car:\nModel: " + super.model + "\nYear: " + super.year + "\nEngine: \nType: " + super.engine.type + "\nHorsepower: " + super.engine.horsepower);
            }
        };
        System.out.println();
        tesla2.info();
    }

}
