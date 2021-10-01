package com.company.task3;

import java.security.PrivateKey;

public class Human {

    private Head head;
    private Hands hands;
    private Legs legs;
    private String name;
    private int age;

    Human(String name, int age, double headCircumference, double handsLength, double legsLength){
        this.name = name;
        this.age = age;
        this.head = new Head(headCircumference);
        this.hands = new Hands(handsLength);
        this.legs = new Legs(legsLength);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Hands getHands() {
        return hands;
    }

    public Head getHead() {
        return head;
    }

    public Legs getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head circumference=" + head.circumference +
                ", hands length=" + hands.length +
                ", legs length=" + legs.length +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Legs{

        private double length;

        Legs(double length){
            this.length = length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void go(){
            System.out.println("Human is walking");
        }
        public void sitDown(){
            System.out.println("Human sitting");
        }
        public void standUp(){
            System.out.println("Human stands");
        }
    }

    public static class Head{

        private double circumference;

        Head(double circumference){
            this.circumference = circumference;
        }

        public void setCircumference(double circumference) {
            this.circumference = circumference;
        }

        public double getCircumference() {
            return circumference;
        }

        public void turnLeft(){
            System.out.println("Head turned to the left");
        }
        public void turnRight(){
            System.out.println("Head turned to the right");
        }
    }

    public static class Hands{

        private double length;

        Hands(double length){
            this.length = length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }
        public void up(){
            System.out.println("Hands up");
        }
        public void down(){
            System.out.println("Hands down");
        }
    }
}
