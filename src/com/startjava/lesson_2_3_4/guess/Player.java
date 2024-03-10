package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int playerAttempt;
    private final int[] playerNumbers;

    public Player(String name) {
        this.name = name;
        playerNumbers = new int[10];
    }
    public void addNumber(int number) {
        playerNumbers[playerAttempt] = number;
        ++playerAttempt;
    }
    public void getPlayerNumbers() {
        if (playerAttempt == 0) {
            System.out.print("-");
        }
        for (int i = 0; i < playerAttempt; i++) {
                System.out.print(playerNumbers[i] + " ");
        }
    }
    public int getPlayerAttempt() {
        return playerAttempt;
    }
    public String getName() {
        return name;
    }
    public void clear() {
        Arrays.fill(playerNumbers, 0, playerAttempt, 0);
        playerAttempt = 0;
    }

}