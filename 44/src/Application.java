// Haruka Kasugano 8/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int pin = 8899174;
		
		System.out.println("WELCOME TO THE BANK OF VIRGINS.");
		System.out.println("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		
		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR PORN ACCOUNT.");
		
	}

}
