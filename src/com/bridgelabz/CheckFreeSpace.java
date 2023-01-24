package com.bridgelabz;
import java.util.Scanner;

public class CheckFreeSpace {
    static char[] board = new char[10];
    static char player, computer;
    private static int playLocation;
    public static Scanner scannerObject = new Scanner(System.in);

    /*
     *creating the game board
     *Select the index from 1 to 9 to make the move.
     */
    public static void createBoard()
    {
        for (int index = 1; index < 10; index++)
        {
            board[index] = ' ';
        }
    }

    /*
     * This game has two player x and o
     */
    public static void getPlayerChoice()
    {

        System.out.print("select X or O : ");
        player = Character.toUpperCase(scannerObject.next().charAt(0));

        if (player == 'X')
            computer = 'O';
        else
            computer = 'X';
        System.out.println("You have selected : " + player);
        System.out.println("Computer's choice is : " + computer);
    }

    /*
     * Displaying the tictactoe game board
     */
    public static void showBoard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    /*
     * user is going to make a move to the desired location
     * if it is not in range from 1 to 9
     * then it will show you an invalid input
     */
    public static void userMove()
    {
        System.out.println("Enter Location 1-9 to Make Move");
        playLocation = scannerObject.nextInt();
        if (playLocation < 10 && playLocation > 0)
        {
            board[playLocation] = player;
            showBoard();
        } else
        {
            System.out.println("Invalid Choice");
        }
    }
    /*
     * the isEmpty is an inbuilt method
     * boolean value is returned by the isEmpty method
     * Check whether is the given string empty or not
     *
     */
    public static boolean isEmpty() {
        if (board[playLocation] == ' ') {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Tic Tac Toe");
        createBoard();
        getPlayerChoice();
        showBoard();
        userMove();
        isEmpty();
    }
}
