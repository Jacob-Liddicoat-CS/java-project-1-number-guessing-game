import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main (Strings[] args) {

		Random rand = new Random();
		int numberToGuess = rand.nextInt(101);
		int numberOfTries = 0;

