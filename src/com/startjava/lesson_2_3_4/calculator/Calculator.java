package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        if (elements.length != 3) {
            throw new RuntimeException("Неверное выражение! Используйте формат [a '+' b]");
        }

        int numberOne = checkNumber(elements[0]);
        int numberTwo = checkNumber(elements[2]);

        char sign = elements[1].charAt(0);
        switch (sign) {
            case '+':
                return numberOne + numberTwo;
            case '-':
                return numberOne - numberTwo;
            case '*':
                return numberOne * numberTwo;
            case '/':
                if (numberTwo == 0) {
                    throw new RuntimeException("Деление на ноль!");
                }
                return (double) numberOne / numberTwo;
            case '%':
                return numberOne % numberTwo;
            case '^':
                return Math.pow(numberOne, numberTwo);

            default:
                throw new RuntimeException("Ошибка: знак " + sign + " не поддерживается!");
        }
    }
    private int checkNumber(String element) {
        int number;
        try {
            number = Integer.parseInt(element);
        } catch (RuntimeException e) {
            throw new RuntimeException(element + " - не число!");
        }
        return number;
    }

}