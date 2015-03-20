// Haruka Kasugano 9/3/2015
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		int nbr, input, tries = 0;
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);
		nbr = 1 + generator.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
		System.out.println("");
		
		do {
			System.out.println("Your guess: ");
			input = keyboard.nextInt();
			
			if ( input == nbr ){
				System.out.println("That's right! You are a good guesser.");
			} else {
				System.out.println("That is incorrect. Guess again.");
			}
			tries ++;
			
		} while ( input != nbr );
		
		System.out.println("It only took you " + tries + " tries.");
	}

}
