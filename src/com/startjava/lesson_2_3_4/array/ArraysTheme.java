package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] reverseArrayValues = {1, 7, 4, 5, 2, 6, 3};

        for (int i = 0; i < reverseArrayValues.length / 2; i++) {
            int tmp = reverseArrayValues[i];
            reverseArrayValues[i] = reverseArrayValues[reverseArrayValues.length - 1 - i];
            reverseArrayValues[reverseArrayValues.length - 1 - i] = tmp;
        }
        for (int x : reverseArrayValues) {
            System.out.print(x + " ");
        }

        System.out.println("\n\n2. Произведение элементов массива");
        int[] multiplyArrayValues = new int[10];

        for (int i = 0; i < multiplyArrayValues.length; i++) {
            multiplyArrayValues[i] = i;
        }

        int multiplyResult = 1;
        for (int i = 1; i < multiplyArrayValues.length - 1; i++) {
            multiplyResult *= multiplyArrayValues[i];
            System.out.print(i + (i < multiplyArrayValues.length - 2 ? " * " : " = " + multiplyResult));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] deleteArrayValues = new double[15];

        for (int i = 0; i < deleteArrayValues.length; i++) {
            deleteArrayValues[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        printDeleteArrayValues(deleteArrayValues);

        double averageNumber = deleteArrayValues[deleteArrayValues.length / 2];
        int countZeros = 0;

        for (int i = 0; i < deleteArrayValues.length; i++) {
            if (deleteArrayValues[i] > averageNumber) {
                deleteArrayValues[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\n");
        System.out.println("Отформатированный массив:");
        printDeleteArrayValues(deleteArrayValues);
        System.out.print("\nОбнуленных ячеек: " + countZeros);

        System.out.println("\n\n4. Вывод алфавита лесенкой");

        char[] alphabetUpperCase = new char['Z' - 'A' + 1];
        for (int i = 0; i < alphabetUpperCase.length; i++) {
            alphabetUpperCase[i] = (char) ('A' + i);
        }

        for (int i = 0; i < alphabetUpperCase.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabetUpperCase[alphabetUpperCase.length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Заполнение массива уникальными числами");
        Random random = new Random();
        int[] uniqueNumbers = new int[30];
        uniqueNumbers[0] = random.nextInt(60, 100);
        for (int i = 1; i < uniqueNumbers.length; i++) {
            int randomNumber = random.nextInt(60, 100);
            for (int j = 0; j < i; j++) {
                if (randomNumber == uniqueNumbers[j]) {
                    randomNumber = -1;
                    i--;
                    break;
                }
            }
            if (randomNumber != -1) {
                uniqueNumbers[i] = randomNumber;
            }
        }
        bubbleSort(uniqueNumbers);
        printUniqueArrayValues(uniqueNumbers);
    }
    public static void printDeleteArrayValues(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }
    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
    public static void printUniqueArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 20 || i == array.length - 10) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }
}
