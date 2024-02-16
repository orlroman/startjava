package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setName("Scar");
        wolfOne.setWeight(35);
        wolfOne.setAge(6);
        wolfOne.setColor("black");

        System.out.println("Wolf gender is " + wolfOne.getGender());
        System.out.println("Wolf name is " + wolfOne.getName());
        System.out.println("Wolf weight is " + wolfOne.getWeight() + " kg");

        if (wolfOne.getAge() != 0) {
            System.out.println("Wolf age is " + wolfOne.getAge() + " years old");
        }

        System.out.println("Wolf color is " + wolfOne.getColor() + "\n");

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();



    }
}