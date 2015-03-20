// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		double nbr, sr;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number: ");
		nbr = keyboard.nextDouble();
		
		while ( nbr < 0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.println("Try again: ");
			nbr = keyboard.nextDouble();
		}
		
		sr = Math.sqrt(nbr);
		System.out.println("The square root of " + nbr + " is " + sr + ".");
	}
}