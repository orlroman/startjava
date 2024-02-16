package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    // Конструкторы
    public Jaeger() {
        modelName = "Standard Jaeger";
        mark = "Mark - 1";
        origin = "USA";
        height = 70.1F;
        weight = 2.0F;
        speed = 5;
        strength = 2;
        armor = 3;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight,
                    int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    // Геттеры
    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }


    public int getArmor() {
            return armor;
    }

    // Сеттеры
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // Методы
    public void move() {
        System.out.println(modelName + " Moving...");
    }

    public void scan() {
        System.out.println(modelName + " Scanning...");
    }

    public void wearWeapon() {
        System.out.println(modelName + " wear a weapon.");
    }

    public String toString() {
        return "Model Name: " + modelName + "\n" + 
                "Mark: " + mark + "\n" + 
                "Origin: " + origin + "\n" + 
                "Height: " + height + " (m)" + "\n" +
                "Weight: " + weight + " (tons)" + "\n" +
                "Speed: " + speed + "\n" +
                "Strength: " + strength + "\n" + 
                "Armor: " + armor;
    }
    

}