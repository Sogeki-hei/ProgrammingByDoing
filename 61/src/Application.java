// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 3, b = 3, c = 3, minus;
		String input;

		do {
			System.out.println("A: " + a + "  B: " + b + "  C: " + c);
			System.out.println("Choose a pile: ");

			input = sc.next();

			if (input.equals("A")) {
				System.out.println("How many to remove from pile A: ");
				minus = sc.nextInt();
				if ( minus <= a )
					a = a - minus;
				else 
					System.out.println("Surely a you can't take more than what it has.");
			}
			if (input.equals("B")) {
				System.out.println("How many to remove from pile B: ");
				minus = sc.nextInt();
				if ( minus <= b )
					b = b - minus;
				else 
					System.out.println("Surely a you can't take more than what it has.");

			}
			if (input.equals("C")) {
				System.out.println("How many to remove from pile C: ");
				minus = sc.nextInt();
				if ( minus <= c )
					c = c - minus;
				else 
					System.out.println("Surely a you can't take more than what it has.");

			}
			else {
				System.out.println("Input Error. Please try again.");
			}
		} while (a != 0 || b != 0 || c != 0);
		System.out.println("All piles are empty. Good job!");

	}
}
