// Haruka Kasugano 9/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		int number, total;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I will add up the numbers you give me.");
		System.out.println("Number: ");
		number = keyboard.nextInt();
		total = number;
		
		while ( number != 0 ) {
			System.out.println("The total so far is " + total + ".");
			System.out.println("Number: ");
			number = keyboard.nextInt();
			total = number + total;
		}
		System.out.println("The total is " + total + ".");
		
	}

}
