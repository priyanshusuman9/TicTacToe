package com.bridgelabz;

public class CreateBoard {
    private static char[] board = new char[10];

    static void startGame() {
        for (int i = 1; i <= 9; i++) {
            board[i] = 1;
            System.out.println(board);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe ");
        startGame();
    }

}