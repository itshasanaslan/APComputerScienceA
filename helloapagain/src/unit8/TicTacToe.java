package unit8;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board = new char[3][3]; // 3x3 board
    private char currentPlayer = 'X'; // Start with player 'X'

    public void run() {
        Scanner scanner = new Scanner(System.in);
        initializeBoard(); // Set up empty board
        boolean gameWon = false;

        while (!gameWon && !isBoardFull()) {
            printBoard(); // Display current board
            playerMove(scanner); // Get player input
            gameWon = checkWin(); // Check if the player won
            if (!gameWon) {
                switchPlayer(); // Change turn
            }
        }
        
        printBoard(); // Show final board state
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        scanner.close();
    }

    // Initializes the board with empty spaces
    public void initializeBoard() {
        // TODO: Fill this function to initialize the board with '-'
    }

    // Prints the board
    public void printBoard() {
        // TODO: Fill this function to print the current board state
    }

    // Handles player move input
    public void playerMove(Scanner scanner) {
        // TODO: Fill this function to take user input and update the board if the move is valid
    }

    // Switches to the next player
    public void switchPlayer() {
        // TODO: Fill this function to switch the current player
    }

    // Checks if the board is full (tie condition)
    public boolean isBoardFull() {
        // TODO: Fill this function to check if the board is full
        return false;
    }

    // Checks if a player has won
    public boolean checkWin() {
        // TODO: Fill this function to check for a winning condition
        return false;
    }
}