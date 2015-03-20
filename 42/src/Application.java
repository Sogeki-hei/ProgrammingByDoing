// Haruka Kasugano 8/3/2015
import java.util.Scanner;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int nbr, input;
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		nbr = 1 + number.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.println("> ");
		input = keyboard.nextInt();
		
		if ( input < nbr ) 
			System.out.println("Sorry, you are too low. I was thinking of " + nbr + ".");
		if ( input > nbr )
			System.out.println("Sorry, you are too high. I was thinking of " + nbr + ".");
		if ( input == nbr )
			System.out.println("You guess it! What are the odds?!?");
		
		System.exit(0);
	}

}
