package com.company.task12;

public class First {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student("Student" + String.valueOf(i));
        }

        for (Student s: students){
            System.out.println(s);
        }

        for (int i = 1; i < students.length; i++) {
            Student st = students[i];
            int value = students[i].getId();
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < students[j].getId()) {
                    students[j + 1] = students[j];
                }
                else
                    break;
            }
            students[j + 1] = st;
        }

        System.out.println();
        for (Student s: students){
            System.out.println(s);
        }
    }
}
