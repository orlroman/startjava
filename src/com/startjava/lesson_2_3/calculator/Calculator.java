package com.startjava.lesson_2_3.calculator;
import java.util.*;

public class Calculator {
    private int numberOne;
    private int numberTwo;
    private char sign;
    private int result;
    private Scanner sc = new Scanner(System.in);

    // Сеттеры
    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setSign(String sign) {
        if (sign.length() > 1) {
            System.out.print("Неверный знак математической операции, попробуйте еще раз: ");
            setSign(sc.next());
        } else if (sign.charAt(0) == '+' || sign.charAt(0) == '-' || sign.charAt(0) == '%' ||
                  sign.charAt(0) == '/' || sign.charAt(0) == '*' || sign.charAt(0) == '^') {
            this.sign = sign.charAt(0);
        } else {
            System.out.print("Неверный знак математической операции, попробуйте еще раз: ");
            setSign(sc.next());
        }
    }

    public void calculate() {
        switch (sign) {
        case '+':
            result = numberOne + numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
            break;
        case '-':
            result = numberOne - numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
            break;
        case '*':
            result = numberOne * numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
            break;
        case '%':
            result = numberOne % numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
            break;
        case '/':
            divide();
            break;
        case '^':
            pow();
            break;
        }
    }

    private void pow() {
        int sqrt = 1;
        for (int i = 0; i < numberTwo; i++ ) {
            sqrt *= numberOne;
        }
        result = sqrt;
        System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
    }

    private void divide() {
        if (numberTwo == 0) {
            System.out.println("Деление на ноль!");
        } else if (numberOne % numberTwo != 0) {
            double d = (double) numberOne / numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + d);
        } else {
            result = numberOne / numberTwo;
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
        }
    }
}