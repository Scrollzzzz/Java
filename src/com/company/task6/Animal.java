package com.company.task6;

public class Animal implements Nameable {
    String name;
    String kind;
    int age;

    Animal(String name, String kind, int age){
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
