// Haruka Kasugano 5/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
		name = keyboard.nextLine();
		System.out.println("Ok, " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if ( age < 16 ) {
			System.out.println("You can't drive.");
		}
		else if ( age <= 17 ) {
			System.out.println("You can drive but not vote.");
		}
		else if ( age <= 24 ) {
			System.out.println("You can vote but not rent a car.");
		}
		else {
			System.out.println("You can do pretty much anthing.");
		}
		
	}

}
