import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int low = 1;
		int high = 10000;
		int random = (int)(Math.random() * 10000);
	
		int guess = 0;
		int guessCount = 1;
	
		int correct = 0;
	
		while (correct == 0) {
			System.out.println("Enter a guess between " + low + " and " + high);
			guess = input.nextInt();
		
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
			else if(guess == random) {
				System.out.println("You WIN. It took you " + guessCount + " guesses.");
				correct = 1;
			}
			else {
				System.out.println("INVALID. Entry is not between " + low + " and " + high);
			}
		}
	}
	
}
