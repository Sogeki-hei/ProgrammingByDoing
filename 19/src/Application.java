// Haruka Kasugano 5/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hey, what's your name? ");
		name = keyboard.nextLine();
		System.out.println("Ok, " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if ( age < 16 ) {
			System.out.println("You can't drive, " + name);
		}
		
		if ( age < 18 ) {
			System.out.println("You can't vote, " + name);
		}
		
		if ( age < 25 ) {
			System.out.println("You can't rent a car, " + name);
		}
		
		if ( age >= 25 ) {
			System.out.println("You can do anything that's legal, " + name);
		}
		
	}

}
