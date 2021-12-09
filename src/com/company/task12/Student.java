package com.company.task12;

import java.util.Comparator;

public class Student{
    String name;
    int id;
    int score;

    Student(String name){
        this.name = name;
        this.id = (int)(Math.random()*501);
        this.score = (int)(Math.random()*101);
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }

    public static final Comparator<Student> STUDENT_COMPARATOR = (o1, o2) -> Integer.compare(o2.getScore(), o1.getScore());
}
