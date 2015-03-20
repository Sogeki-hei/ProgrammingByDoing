// Haruka Kasugano 7/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		String name;
		int age;
		Scanner keyboard =  new Scanner(System.in);
		
		System.out.println("Your name: ");
		name = keyboard.nextLine();
		System.out.println("Your age: ");
		age = keyboard.nextInt();
		
		if ( age < 16 ) {
			System.out.println("You can't drive, " + name );
		}
		if ( age > 15 && age < 18 ) {
			System.out.println("You can drive but not vote, " + name );
		}
		if ( age > 17 && age < 25 ) {
			System.out.println("You can vote but not rent a car, " + name );
		}
		if ( age > 24 ) {
			System.out.println("You can do pretty much anything, " + name);
		}
	}

}
