package com.startjava.lesson_2_3_4.guess;
import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isContinue = "yes";

        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        GuessNumber game = new GuessNumber(firstPlayerName, secondPlayerName);

        while(!"no".equals(isContinue)) {
            if ("yes".equals(isContinue)) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            isContinue = scanner.nextLine();
        }
    }
}