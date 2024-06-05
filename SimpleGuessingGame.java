import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean keepPlaying = true;
        int roundsWon = 0;
        int totalRounds = 0;

        while (keepPlaying) {
            int secretNumber = rand.nextInt(100) + 1;
            int tries = 0;
            int maxTries = 10;
            boolean guessedRight = false;

            System.out.println("Guess the number between 1 and 100. You have 10 tries.");

            while (tries < maxTries) {
                System.out.print("Enter the Number : ");
                int userGuess = input.nextInt();
                tries++;

                if (userGuess == secretNumber) {
                    System.out.println("YOU WIN ");
                    guessedRight = true;
                    roundsWon++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("too low.");
                } else {
                    System.out.println("too high.");
                }
            }

            if (!guessedRight) {
                System.out.println("YOU LOST . THE CORRECT NUMBER IS " + secretNumber + ".");
            }

            totalRounds++;
            System.out.println("You have won " + roundsWon + " out of " + totalRounds + " rounds.");

            System.out.print("Do you want to play again? (yes/no): ");
            String answer = input.next();
            keepPlaying = answer.equalsIgnoreCase("yes");
        }

        System.out.println("Your final score is " + roundsWon + " wins out of " + totalRounds + " rounds.");
        input.close();
    }
}
