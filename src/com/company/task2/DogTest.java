package com.company.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {

    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("Corgi", "Pinch", 3);
        dogs.add(dog);
        System.out.println(dog);
        dog.setBreed("Beagle");
        dog.setName("Coul");
        dog.setAge(5);
        System.out.println(dog);
        dogs.addAll(addDogs(2));
        for (Dog d : dogs){
            System.out.println(d);
        }
    }

    public static ArrayList<Dog> addDogs(int q){
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < q; i++){
            System.out.println("Breed: ");
            Scanner in = new Scanner(System.in);
            String breed = in.next();
            System.out.println("Name: ");
            String name = in.next();
            System.out.println("Age: ");
            int age = in.nextInt();
            Dog dog = new Dog(breed, name, age);
            dogs.add(dog);
        }
        return dogs;
    }
}
