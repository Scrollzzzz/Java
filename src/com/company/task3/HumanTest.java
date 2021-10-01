package com.company.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("rgtr", 54, 48, 100, 80);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.getHands().up();
        human.getHead().turnLeft();
        human.getLegs().go();
        System.out.println(human);
    }
}
