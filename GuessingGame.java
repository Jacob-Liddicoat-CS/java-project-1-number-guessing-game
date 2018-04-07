import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main (Strings[] args) {

		Random rand = new Random();
		int numberToGuess = rand.nextInt(101);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;

		System.out.println("Guess a number between 1 and 100: ");
		guess = input.nextInt();

		if (guess == numberToGuess) {

		}
		else if (guess < numberToGuess) {
			System.out.println("Your guess is too low");
		}
		else if (guess > numberToGuess) {
			System.out.println("Your guess is too high");
		}
	}

}
