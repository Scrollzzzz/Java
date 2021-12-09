package com.company.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second{
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            students.add(new Student("Student" + String.valueOf(i)));
        }

        for (Student s: students){
            System.out.println(s);
        }

        students.sort(Student.STUDENT_COMPARATOR);

        System.out.println();
        for (Student s: students){
            System.out.println(s);
        }
    }
}
