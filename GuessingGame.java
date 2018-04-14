import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String args[]) {

		Random rand = new Random();//Generates random number generator from 1-100
		int numberToGuess = rand.nextInt(101);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);//Generates Scanner that scans the numbers you input
		int guess;
		boolean win = false;

		while (win == false) {

		System.out.println("Guess a number between 1 and 100: ");
		guess = input.nextInt();
		numberOfTries++;//Calculates number of tries

		if (guess == numberToGuess) { //Keeps guessing numbers if win statement is false
			win = true;

		}
		else if (guess < numberToGuess) {
			System.out.println("Your guess is too low");
		}
		else if (guess > numberToGuess) {
			System.out.println("Your guess is too high");
		}
	    }
	    System.out.println("You win");
	    System.out.println("The number was " + numberToGuess);
	    System.out.println("It took you " + numberOfTries + " tries");
	}

}
