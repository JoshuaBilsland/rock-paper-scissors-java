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
import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String [] args){
        // TODO: Declare variables of different data types.
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        int gamesWon = 0;
        int gamesLost = 0;
        boolean playAgain = false;
        Scanner scanner = new Scanner(System.in);

        // TODO: Create do-while loop (main game loop).
        do {
            // TODO: Call displayMenu() method.
            displayMenu(gamesWon, gamesLost);
            // TODO: Call getUserChoice() method.
            int userChoice = getUserChoice(scanner);
            // TODO: Randomly generate computer choice.
            Random random = new Random();
            int computerChoice = random.nextInt(0,3);
            // TODO: Call evaluateRound() method.
            int result = evaluateRound(userChoice, computerChoice);
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
    private static int getUserChoice(Scanner scanner){
        int userChoice;
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        System.out.println("------------");
        do {
            System.out.print("Enter choice (0/1/2): ");
            userChoice = scanner.nextInt();
        }
        while(userChoice != 0 && userChoice != 1 && userChoice != 2);
        return userChoice;
    }
    // TODO: evaluateRound() - decide who wins the round
    private static int evaluateRound(int userChoice, int computerChoice){
        /*
        Take advantage of the cycle of rock-paper-scissors.
        0 = Draw
        1 = Player 1 (User) wins
        2 = Player 2 (Computer) wins
        */
        return ((userChoice - computerChoice) + 3) % 3;
    }
    // TODO: playAgain() - Scanner + while loop (validation) for getting user choice.
}