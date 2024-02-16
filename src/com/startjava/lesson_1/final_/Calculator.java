package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        int a = 6;
        int b = 3;
        int result = 0;
        if (sign == '/') {
            if (b == 0) {
                System.out.println("Деление на ноль!");
            } else if (a % b != 0) {
                double d = (double) a / b;
                System.out.println(a + " " + sign + " " + b + " = " + d);
            } else {
                result = a / b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            }
        }

        if (sign == '*') {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '+') {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '-') {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '%') {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }

        if (sign == '^') {
            if (b != 0) {
                int sqrt = 1;
                for (int i = 0; i < b; i++ ) {
                    sqrt *= a;
                }
                result = sqrt;
            } else {
                result = 1;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}