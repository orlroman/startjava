package com.startjava.lesson_2_3.guess;
import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String namePlayerOne = scanner.next();
        Player playerOne = new Player(namePlayerOne);
        boolean isStop = false;

        System.out.println("Введите имя второго игрока: ");
        String namePlayerTwo = scanner.next();
        Player playerTwo = new Player(namePlayerTwo);

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        while(!isStop) {
            guessNumber.start();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]");
                String answer = scanner.next();

                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    isStop = true;
                    break;
                } else {
                    System.out.print("Неверный ввод!\n");
                }
            } while (true);
        }
    }
}