package com.startjava.lesson_2_3.guess;
import java.util.*;

public class GuessNumber {
    private int guessNumber;
    private Player playerOne;
    private Player playerTwo;
    private Scanner scanner = new Scanner(System.in);
    private boolean isGuess;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
            guessNumber = (int) (Math.random() * 100) + 1;
            System.out.println("\nКомпьютер загадал число в диапазоне от 0 до 100, попробуйте отгадать!\n");
            isGuess = false;

            while(!isGuess) {
                System.out.print(playerOne.getName() + " угадывает число: ");
                int num = scanner.nextInt();
                playerOne.setNumber(num);
                playerTurn(playerOne.getNumber(), playerOne);

                if (!isGuess) {
                    System.out.print(playerTwo.getName() + " угадывает число: ");
                    num = scanner.nextInt();
                    playerTwo.setNumber(num);
                    playerTurn(playerTwo.getNumber(), playerTwo);
                }
            // System.out.println(getGuessNumber());
            }
    }

    public void playerTurn(int number, Player player) {
        if (number < 0 || number > 100) {
            System.out.print("Число не в диапазоне 0 - 100, " + player.getName() +  " попробуйте еще раз: ");
            playerTurn(scanner.nextInt(), player);
        } else if (number == guessNumber) {
            System.out.println(player.getName() + " угадал число!");
            isGuess = true;
        } else {
            System.out.println(player.getName() + " не угадал число :(");
            if (number > guessNumber) {
                System.out.println("Число " + number + " больше того, что загадал компьютер\n");
            } else {
                System.out.println("Число " + number + " меньше того, что загадал компьютер\n");
            }
            isGuess = false;
        }
    }

    // public int getGuessNumber() {
    //     return guessNumber;
    // }

}