// Haruka Kasugano 8/3/2015
import java.util.Scanner;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int nbr, input;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		nbr = 1 + generator.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess: ");
		input = keyboard.nextInt();
		
		while ( input != nbr ) {
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess: ");
			input = keyboard.nextInt();
		}
		System.out.println("That's right! You're a good guesser.");
		
		
	}
	
}
