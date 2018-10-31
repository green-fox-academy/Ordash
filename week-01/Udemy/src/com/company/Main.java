package com.company;

public class Udemy {
    public StatemntsWhiteSpaceIndenting() {
    }

    public static void main(String[] args) {
        int myVariable = true;
        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int finalscore = score + levelsCompleted * bonus;
            System.out.println((String)finalscore);
        }

        int score2 = 10000;
        int levelsCompleted2 = 8;
        int bonus2 = 200;
        if (gameOver) {
            int finalscore2 = score2 + levelsCompleted2 * bonus2;
            System.out.println((String)finalscore2);
        }

    }
}