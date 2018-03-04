import java.util.Scanner;

public class Exercise_3 {
	
	/* Created by James Harbison 
	 * This program generates a random number between 1 and 10000 and proposes a guessing game
	 * where the user is to play a game of higher or lower until the random number is guessed
	 * after which the number of guesses taken to determine the random number
	 */
	
	public static void main(String[] args) {
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// initialize guessing variables
		int low = 1;
		int high = 10000;
		int random = (int)(Math.random() * 10000);
		
		int guess = 0;
		int guessCount = 1;
		
		// initialize a variable that goes non zero when the correct number is guessed
		int correct = 0;
		
		
		while (correct == 0) {
			// display prompt for a number and read the next input
			System.out.println("Enter a guess between " + low + " and " + high);
			guess = input.nextInt();
		
			// determines if the guess is higher or lower, then updates the bounds to narrow the guessing field
			if(guess > random && guess < high) {
				System.out.println("LOWER");
				high = guess;
				guessCount ++;
			}
			else if(guess < random && guess > low) {
				System.out.println("HIGHER");
				low = guess;
				guessCount ++;
			}
			// determines if the guess is correct and updates the "correct" variable
			else if(guess == random) {
				System.out.println("You WIN. It took you " + guessCount + " guesses.");
				correct = 1;
			}
			// if the guess is not between the given bounds an error message is displayed and the guess is not counted
			else {
				System.out.println("INVALID. Entry is not between " + low + " and " + high);
			}
		}
	}
	
}
