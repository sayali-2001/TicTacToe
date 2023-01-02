package NewPackage;
import java.util.Random;
import java.util.Scanner;

import static NewPackage.TicTac.computerChoice;

public class TicTacToe {
    static char[] board = new char[10];
    public static Scanner scannerObject = new Scanner(System.in);
    private static int playLocation;
    static char player,computer;
    public static Scanner scanner = new Scanner(System.in);
    static void createBoard() {
        for(int i=1;i<10;i++) {
            board[i]=' ';
        }

    }
    static void choice() {
        int turn=(int) (Math.random() * 10) % 2;
        if(turn == 0) {
            System.out.println("user play first");
        }else if(turn == 1) {
            System.out.println("computer play first");
        }
    }

    static void computerChoice() {
        int computerTurn=(int)(Math.random() * 10) % 10;
        board[computerTurn]=computerChoice;
        System.out.println("Computer choice is :: "+computerChoice);
    }


    static void showBoard() {
        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
    }
    public static void userMove() {
        System.out.println("Enter Location 1-9 to Make Move");

         playLocation = scannerObject.nextInt();
        if (playLocation < 10 && playLocation > 0) {
            board[playLocation] = player;
            showBoard();
        } else {
            System.out.println("Invalid Choice");
        }
    }
    public static boolean isEmpty() {
        if (board[playLocation] == ' ') {
            return true;
        } else {
            return false;
        }
    }
    public static void checkToss() {

        double tossResult = Math.floor(Math.random() * 10) % 2;
        System.out.println("\nChoose 1 for Heads or 2 for Tails");
        int coinSelect = scannerObject.nextInt();
        if (coinSelect == tossResult) {
            System.out.println("\nPlayer Won The Toss! Player Starts");
        } else {
            System.out.println("\nComputer Won The Toss! Computer Starts");
        }
    }
    public static void main(String[] args) {

        System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");

        createBoard();
        choice();
        computerChoice();
        showBoard();
        userMove();checkToss();
        isEmpty();

    }
    }

