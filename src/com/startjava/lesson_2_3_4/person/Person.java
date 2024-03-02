package com.startjava.lesson_2_3_4.person;

public class Person {
    public String gender = "Male";
    public String name = "Roman";
    public int age = 30;
    public int weight = 80;
    public int height = 175;

    public void move() {
        System.out.println(name + " is moving");
    }

    public void sit() {
        System.out.println(name + " is sit");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void speak() {
        System.out.println(name + " is speaking");
    }

    public void learnJava() {
        System.out.println(name + " is learning Java");
    }
}