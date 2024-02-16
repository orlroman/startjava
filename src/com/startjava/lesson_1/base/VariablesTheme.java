package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера:");
        byte ramSizeGb = 16;
        short countCores = 4;
        char systemDisc = 'C';
        int pcPrice = 70_000;
        long ssdSizeGb = 128;
        float monitorWidthPx = 1024;
        double monitorHeightPx = 768;
        boolean isPc = false;;
        // System.out.println(b + " " + s + " " + i + " " + l +
        //         " " + f + " " + d + " " + ch + " " + bool);

        System.out.println("\n2. Расчет стоимости товара со скидкой:");
        int penPrice = 100;
        int bookPrice = 200;
        int totalCost = penPrice + bookPrice;
        int costWithDiscount = totalCost - (totalCost * 11 / 100);

        System.out.println("Общая стоимость книги с ручкой = " + totalCost + " руб.");
        System.out.println("Скидка " + totalCost * 11 / 100 + " руб.");
        System.out.println("Общая стоимость со скидкой = " + costWithDiscount + " руб.");

        System.out.println();

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa     ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(byteMax);
        System.out.println(++byteMax);
        System.out.println(--byteMax);

        int intMax = Integer.MAX_VALUE;
        System.out.println(intMax);
        System.out.println(++intMax);
        System.out.println(--intMax);

        System.out.println();

        System.out.println("5. Перестановка значений переменных");
        int firstNumber = 2;
        int secondNumber = 5;
        System.out.println("Перестановка переменных с помощью ^");
        System.out.println("Исходное значение firstNumber = " + firstNumber);
        System.out.println("Исходное значение secondNumber = " + secondNumber);
        firstNumber ^= secondNumber;
        secondNumber ^= firstNumber;
        firstNumber ^= secondNumber;
        System.out.println("Новое значение firstNumber = " +  firstNumber);
        System.out.println("Новое значение secondNumber = " +  secondNumber);

        System.out.println();

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println((int) dollar + " - " + dollar);

        System.out.println();

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int hundreds = n / 100;
        int dozens = n / 10 % 10;
        int units = n % 10;
        int sum = hundreds + dozens + units;
        int multiplication = hundreds * dozens * units;
        System.out.println("Число N содержит: ");
        System.out.println("\tСотен - " + hundreds);
        System.out.println("\tДесятков - " + dozens);
        System.out.println("\tЕдиниц - " + units);
        System.out.println("\tСумма его цифр = " + sum);
        System.out.println("\tПроизведение = " + multiplication);

        System.out.println();

        System.out.println("9. Вывод времени");
        int numberOfSeconds = 86399;
        int hours = (numberOfSeconds / 60) / 60;
        int minutes = (numberOfSeconds / 60) % 60;
        
        int seconds = (numberOfSeconds % 60);

        System.out.println(hours + ":" + minutes + ":" + seconds);








       

    }
}