package com.startjava.lesson_2_3.animal;

public class Wolf {
    // Поля
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    // Геттеры
    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    // Сеттеры
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age!!\n");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Методы
    public void move() {
        System.out.println("Wolf " + name + " is moving");
    }

    public void sit() {
        System.out.println("Wolf " + name + " is sit");
    }

    public void run() {
        System.out.println("Wolf "+ name + " is running");
    }

    public void howl() {
        System.out.println("Wolf " + name + " is howling");
    }

    public void hunt() {
        System.out.println("Wolf " + name + " is hunting");
    }

}