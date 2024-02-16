package com.startjava.lesson_1.base;
public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        int age = 21;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        int height = 2;
        if (height < 1.8) {
            System.out.println("Рост меньше 1.8 м");
        } else {
            System.out.println("Рост больше 1.8 м, рост равен = " + height);
        }

        char firstLetterName = "Roman".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на 'I'");
        } else {
            System.out.println("Имя начинается на '" + firstLetterName + "'");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 4;
        int b = 7;
        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("b больше a");
        } else {
            System.out.println("числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = -8;
        if (num == 0) {
            System.out.println("Число равно 0");
        } else {
            if (num > 0) {
                System.out.print("Число " + num + " положительное и ");
            } else {
                System.out.print("Число " + num + " отрицательное и ");
            }
            if (num % 2 == 0) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 334;
        boolean hasDigit = false;
        int hundersNum1 = num1 / 100;
        int hundersNum2 = num2 / 100;
        int dozensNum1 = (num1 / 10) % 10;
        int dozensNum2 = (num2 / 10) % 10;
        int digitsNum1 = num1 % 10;
        int digitsNum2 = num2 % 10;
        
        System.out.println("Представленные числа " + num1 + " и " + num2);
        if (hundersNum1 == hundersNum2) {
           System.out.println("Одинаковые сотни, равные " + hundersNum1);
           hasDigit = true;
        }
        if (dozensNum1 == dozensNum2) {
           System.out.println("Одинаковые десятки, равные " + dozensNum1);
           hasDigit = true;
        }
        if (dozensNum1 == dozensNum2) {
           System.out.println("Одинаковые единицы, равные " + digitsNum1);
           hasDigit = true;
        }
        if (!hasDigit) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0031';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " - маленькая буква");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " - большая буква");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " - цифра");
        } else {
            System.out.println(ch + " - не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        int percent = 0;
        System.out.println("Сумма вклада " + deposit);
        if (deposit < 100000) {
            percent = 5;
            System.out.println("Процентов начисленно - " + percent);
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 7;
            System.out.println("Процентов начисленно - " + percent + "%");
        } else if (deposit > 300000) {
            percent = 10;
            System.out.println("Процентов начисленно - " + percent);
        }
        int totalDeposit = deposit + (deposit * percent / 100);
        System.out.println("Итоговая сумма - " + totalDeposit);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyScore = 2;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else if (historyPercent > 60) {
            historyScore = 3;
        } else if (historyPercent > 73) {
            historyScore = 4;
        } else if (historyPercent > 91) {
            historyScore = 5;
        }

        int progPercent = 92;
        int progScore = 5;
        if (progPercent <= 60) {
            progScore = 2;
        } else if (progPercent > 60) {
            progScore = 3;
        } else if (progPercent > 73) {
            progScore = 4;
        } else if (progPercent > 91) {
            progScore = 5;
        }

        System.out.println("История - " + historyScore + "\n" + 
                "Программирование - " + progScore + "\n" + 
                "Средний балл - " + ((historyScore + progScore) / 2) + "\n" + 
                "Средний % по предметам - " + ((historyPercent + progPercent) / 2));

        System.out.println("\n8. Расчет годовой прибыли");
        int saleMonthly = 14000;
        int rent = 5000;
        int primeCost = 9000;
        int profit = 12 * (saleMonthly - rent - primeCost);
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

    }
}