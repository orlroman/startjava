package com.startjava.lesson_2_3_4.calculator;
import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (!"no".equals(answer)) {
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                try {
                    double result = calculator.calculate(expression);
                    print(expression, result);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Хотите продолжить? [yes/no]");
            answer = scanner.nextLine();
        }

    }

    public static void print(String expression, double result) {
        System.out.println(expression + " = " + ((result % 1 == 0) ? (int) result : String.format("%.3f", result)));
    }
}