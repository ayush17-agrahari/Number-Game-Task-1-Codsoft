import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 0;
        int roundsWon = 0;
        final int MAX_ATTEMPTS = 7;  // Limit the number of attempts per round

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.print("How many rounds would you like to play? ");
        totalRounds = scanner.nextInt();

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\n🔁 Round " + round + " begins!");

            int targetNumber = random.nextInt(100) + 1;  // Random number between 1 and 100
            int attemptsUsed = 0;
            boolean isGuessed = false;

            while (attemptsUsed < MAX_ATTEMPTS) {
                System.out.print("Enter your guess (1–100): ");
                int guess = scanner.nextInt();
                attemptsUsed++;

                if (guess == targetNumber) {
                    System.out.println("🎉 Correct! You guessed it in " + attemptsUsed + " attempt(s).");
                    roundsWon++;
                    isGuessed = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }

                System.out.println("Attempts left: " + (MAX_ATTEMPTS - attemptsUsed));
            }

            if (!isGuessed) {
                System.out.println("❌ You're out of attempts! The correct number was " + targetNumber + ".");
            }
        }

        // Final Score
        System.out.println("\n🏁 Game Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Rounds Lost: " + (totalRounds - roundsWon));

        scanner.close();
    }
}
