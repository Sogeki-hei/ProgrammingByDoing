// Haruka Kasugano 8/3/2015
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int input, nbr;
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		nbr = 1 + number.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("Your guess: ");
		input = keyboard.nextInt();
		
		if ( input == nbr )
			System.out.println("That's right! My secret number was " + nbr + "!");
		if ( input != nbr )
			System.out.println("Sorry, but I was really thinking of " + nbr + ".");
	}

}
