package com.startjava.lesson_2_3.calculator;
import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean isCalculate = false;
        boolean isAnswer = false;

        while (!isCalculate) {
            System.out.print("Введите первое число: ");
            calculator.setNumberOne(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next());
            System.out.print("Введите второе число: ");
            calculator.setNumberTwo(sc.nextInt());
            System.out.print("Ответ: ");
            calculator.calculate();

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                String answer = sc.next();
                if (answer.equals("no")) {
                    isAnswer = true;
                    isCalculate = true;
                } else if (answer.equals("yes")) {
                    isAnswer = true;
                } else {
                    System.out.print("Неверный ввод!");
                    isAnswer = false;
                }
            } while (!isAnswer);
        }
    }
}