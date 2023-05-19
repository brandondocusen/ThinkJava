// Write a program that generates a random number and asks the user to
// guess what the number is. If the user's guess is higher than the random
// number, the program should display "Too high, try again." If the user's
// guess is lower than the random number, the program should display "Too
// low, try again." The program should use a loop that repeats until the user
// correctly guesses the random number.s
import java.util.Scanner;
import java.util.Random;

public class integerGuessChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int userGuess = rand.nextInt(100) + 1;
        int guess = 0;
        int numGuesses = 0;
        while (guess != userGuess) {
            System.out.print("Type an integer here to guess the random number. ");
            guess = input.nextInt();
            numGuesses++;
            if (guess < userGuess) {
                System.out.println("No, I'm sorry, you guess too low. Try again!");
            } else if (guess > userGuess) {
                System.out.println("No, I'm sorry, you guess too high. Try again!");
            }
        }
        System.out.println("Mad decent guessing. You got it right in " + numGuesses + " guesses!");
    }
}