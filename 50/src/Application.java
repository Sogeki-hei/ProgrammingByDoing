// Haruka Kasugano 8/3/2015
import java.util.Scanner;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		int nbr, input, tries = 0;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		nbr = 1 + generator.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
		System.out.println("First guess: ");
		input = keyboard.nextInt();
		tries ++;
		
		while ( input != nbr && tries < 7 ) {
			if ( input > nbr )
				System.out.println("Sorry, that guess is too high.");
			if ( input < nbr )
				System.out.println("Sorry, you are too low.");
			tries ++;
			System.out.println("Guess # " + tries + ":");
			input = keyboard.nextInt();
		}
		if ( input == nbr ) 
			System.out.println("You guessed it!  What are the odds?!?");
		else 
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		
		System.exit(0);
	}

}
