package com.company.task17;

import java.util.Scanner;

public class Menu {
    private static final double grav = 6.6743;
    private static final double k = 10000000;

    enum Planet{
        Mercury(0.33, 2439.7),
        Venus(4.87, 6051.8),
        Earth(5.9722, 6371),
        Mars(0.642, 3396.2),
        Jupiter(1898.6, 71400),
        Saturn(568, 60268),
        Uranus( 86.8, 25360),
        Neptune(102, 24622);

        private final double mass;
        private final double rad;

        Planet(double mass, double rad){
            this.mass = mass;
            this.rad = rad;
        }
    }

    public double gravAcc(Planet planet){
        return grav*planet.mass*k/(planet.rad*planet.rad);
    }

    public void menu(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name of the planets to find out its gravity acceleration: ");
        String planet = in.next();

        while (!planet.equals("exit")){
            String lPlanet = planet.toLowerCase();
            switch (lPlanet) {
                case "mercury" -> System.out.printf("Gravity acceleration of Mercury is %.2f m/s^2\n\n", gravAcc(Planet.Mercury));
                case "venus" -> System.out.printf("Gravity acceleration of Venus is %.2f m/s^2\n\n", gravAcc(Planet.Venus));
                case "earth" -> System.out.printf("Gravity acceleration of Earth is %.2f m/s^2\n\n", gravAcc(Planet.Earth));
                case "mars" -> System.out.printf("Gravity acceleration of Mars is %.2f m/s^2\n\n", gravAcc(Planet.Mars));
                case "jupiter" -> System.out.printf("Gravity acceleration of Jupiter is %.2f m/s^2\n\n", gravAcc(Planet.Jupiter));
                case "saturn" -> System.out.printf("Gravity acceleration of Saturn is %.2f m/s^2\n\n", gravAcc(Planet.Saturn));
                case "uranus" -> System.out.printf("Gravity acceleration of Uranus is %.2f m/s^2\n\n", gravAcc(Planet.Uranus));
                case "neptune" -> System.out.printf("Gravity acceleration of Neptune is %.2f m/s^2\n\n", gravAcc(Planet.Neptune));
                default -> System.out.println("Unknown planet");
            }
            System.out.print("Enter the name of the planets to find out its gravity acceleration: ");
            planet = in.next();
        }
    }

    public static void main(String[] args) {
        new Menu().menu();
    }
}
