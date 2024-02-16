package com.startjava.lesson_1.final_;

public class GuessNumber {
    public static void main(String[] args) {
        int guessNumber = 300;
        boolean isGuess = false;
        int playerNumber = 53;
        do {
            System.out.println("Угадайте число от 1 до 100: ");
            if (playerNumber > guessNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                if (guessNumber % 2 == 0 && playerNumber % 2 == 0) {
                    playerNumber -= 2;
                } else {
                    playerNumber--;
                }
            } else if (playerNumber < guessNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                if (guessNumber % 2 == 0 && playerNumber % 2 == 0) {
                    playerNumber += 2;
                } else {
                    playerNumber++;
                }
            } else {
                System.out.println("Вы победили!");
                isGuess = true;
            }
        } while (!isGuess);

    } 
}