package com.startjava.lesson_2_3_4.guess;
import java.util.*;

public class GuessNumber {
    private int guessNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private int playerNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(String firstPlayerName, String secondPlayerName) {
        firstPlayer = new Player(firstPlayerName);
        secondPlayer = new Player(secondPlayerName);
    }

    public void start() {
        System.out.println("\nИгра началась! У каждого игрока по 10 попыток.");
        guessNumber = (int) (Math.random() * 100) + 1;

        do {
            if (playerTurn(firstPlayer) || playerTurn(secondPlayer)) {
                break;
            }
        } while (secondPlayer.getPlayerAttempt() < 10);
        endGame();
    }

    private void checkNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        String number = scanner.nextLine();
        try {
            playerNumber = Integer.parseInt(number);
            if (playerNumber < 0 || playerNumber > 100) {
                System.out.println("Число не в диапазоне 0 - 100, " + player.getName() + " попробуйте еще раз.");
                checkNumber(player);
            }
        } catch (RuntimeException e) {
            System.out.println("Должно быть целое число!");
            checkNumber(player);
        }

    }

    private boolean playerTurn(Player player) {

        while (player.getPlayerAttempt() < 10) {
            checkNumber(player);
            player.addNumber(playerNumber);

            if (playerNumber == guessNumber) {
                System.out.println("Игрок " + player.getName() + " угадал число " + guessNumber +
                        " с " + player.getPlayerAttempt() + " попытки!");
                return true;
            } else {
                System.out.println(player.getName() + " не угадал число :(");
                if (playerNumber > guessNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер\n");
                } else {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер\n");
                }
            }
        }

        if (player.getPlayerAttempt() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void endGame() {
        System.out.println("\n" + firstPlayer.getName() + " назвал числа:");
        firstPlayer.getPlayerNumbers();
        firstPlayer.clear();

        System.out.println("\n" + secondPlayer.getName() + " назвал числа:");
        secondPlayer.getPlayerNumbers();
        secondPlayer.clear();
    }



}