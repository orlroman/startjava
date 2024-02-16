package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark - 3", "USA", 79.25F, 1980, 7, 8, 6);

        jaegerOne.setModelName("Chreno Alpha");
        jaegerOne.setMark("Mark - 1");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setHeight(85.34F);
        jaegerOne.setWeight(2412F);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(10);

        System.out.println("\nFirst Jaeger:");
        System.out.println(jaegerOne);
        jaegerOne.move();

        System.out.println("\nSecond Jaeger:");
        System.out.println(jaegerTwo);
        jaegerTwo.wearWeapon();



    }
}