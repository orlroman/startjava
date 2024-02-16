package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while (num <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = 0;
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
            if (b >= c) {
                min = c;
            } else {
                min = b;
            }
        } else if (b >= a && b >= c) {
            max = b;
            if (a >= c) {
                min = c;
            } else {
                min = a;
            }
        } else if (c >= a && c >= b) {
            max = c;
            if (a >= b) {
                min = b;
            } else {
                min = a;
            }
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }
        System.out.println("\nСумма цифр числа - " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int size = 5;
        for (int i = 1; i < 30; ) {
            for (int j = 0; j < size; j++) {
                if (i < 30) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
                i += 2;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int scrNum = 3242592;
        int condition = scrNum;
        int twoes = 0;
        while (condition > 0) {
            int digit = condition % 10;
            if (digit == 2) {
                twoes++;
            }
            condition /= 10;
        }
        String s = (twoes % 2 == 0) ? "четное" : "нечетное";
        System.out.println("В " + scrNum + " " + s + " количество двоек - " + twoes);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int counterInWhile = 5;
        int conditionForWhile = 5;
        int counterForSign = 0;
        while(conditionForWhile > 0) {
            if (counterForSign < conditionForWhile) {
                System.out.print("#");
                counterForSign++;
            } else if (counterForSign == counterInWhile) {
                System.out.println();
                counterForSign = 0;
                counterInWhile--;
                conditionForWhile--;
            }
        }

        System.out.println();
        int cols = 1;
        int rows = 5;
        int mark = 1;
        do {
            do {
                System.out.print("$");
                cols--;
            } while (cols > 0);
            System.out.println();
            rows--;
            mark = rows > 2 ? ++mark : --mark;
            cols = mark;
        } while (rows > 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%s%12s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i <= 122; i++) {
            if ((i < '0' && i % 2 != 0) || (i >= 'a' && i % 2 == 0)) {
                System.out.printf("%n%-12d%-13c%s", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrom = 1235321;
        int copyPal = palindrom;
        int reverse = 0;
        while (copyPal > 0) {
            reverse = reverse * 10 + copyPal % 10;
            copyPal /= 10;
        }
        String isPal = reverse == palindrom ? "является" : "не является";
        System.out.print("Число " + palindrom + " " + isPal + " палиндромом");

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNumber = 655695;
        int firstHalf = luckyNumber / 1000;
        int secondHalf = luckyNumber % 1000;

        int sumFirstHalf = (firstHalf % 10) + ((firstHalf / 10) % 10) + (firstHalf / 100);
        int sumSecondHalf = (secondHalf % 10) + ((secondHalf / 10) % 10) + (secondHalf / 100);

        String isLucky = sumFirstHalf == sumSecondHalf ? "является" : "не является";
        System.out.println("Число " + luckyNumber + " " + isLucky + " счастливым");
        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf + 
                ", а сумма " + secondHalf + " = " + sumSecondHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");
        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("--+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", (j * i));
            }
            System.out.println();
        }
    }
}