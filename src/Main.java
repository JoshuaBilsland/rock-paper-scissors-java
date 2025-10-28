/*
 * PROJECT LEARNING CHECKLIST
 * TODO-PRACTICE: Use Scanner to get input from the user.
 * TODO-PRACTICE: Use different data types (int for menu, double for values, boolean for loop).
 * TODO-PRACTICE: Use a do-while loop for the main program menu.
 * TODO-PRACTICE: Use a switch statement for menu selection.
 * TODO-PRACTICE: Use if-else statements for input validation.
 * TODO-PRACTICE: Use regular while loop.
 * TODO-PRACTICE: Create and call at least 3 different methods.
 * TODO-PRACTICE: Demonstrate explicit casting.
 * TODO-PRACTICE: Demonstrate implicit casting.
 */

public class Main{
    public static void main(String [] args){
        // TODO: Declare variables of different data types.
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        int gamesWon = 0;
        int gamesLost = 0;
        boolean playAgain = false;

        // TODO: Create do-while loop (main game loop).
        do {
            // TODO: Call displayMenu() method.
            displayMenu(gamesWon, gamesLost);
            // TODO: Call getUserChoice() method.

            // TODO: Randomly generate computer choice.

            // TODO: Call evaluateRound() method.

            // TODO: Switch statement to display result.

            // TODO: Call playAgain() method.
        }
        while (playAgain);
        // TODO: Use implicit casting for game results.
    }

    // == Methods ==
    // TODO: displayMenu() - print current scores menu
    private static void displayMenu(int gamesWon, int gamesLost){
        System.out.println("Rock-Paper-Scissors Game!");
        System.out.println("-------------------------");
        System.out.println("Current Scores:");
        System.out.println("\tGames won: " + gamesWon);
        System.out.println("\tGames lost: " + gamesLost);
        System.out.println("-------------------------");
    }
    // TODO: getUserChoice() - use Scanner to get user input.

    // TODO: evaluateRound() - decide who wins the round

    // TODO: playAgain() - Scanner + while loop (validation) for getting user choice.
}