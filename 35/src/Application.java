// Haruka Kasugano 8/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		String name;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your last name? ");
		name = keyboard.nextLine();
		
		int a = name.compareTo("Carswell");
		int b = name.compareTo("Jones");
		int c = name.compareTo("Smith");
		int d = name.compareTo("Young");
		
		if ( a <= 0 ) {
			System.out.println("You don't have to wait long, " + name + ".");
		}
		else if ( b <= 0 ) {
			System.out.println("That's not bad, " + name + ".");
		}
		else if ( c <= 0 ) {
			System.out.println("Looks like a bit of wait, " + name + ".");
		}
		else if ( d <= 0) {
			System.out.println("It's gonna be a while, " + name + ".");
		}
		else if ( d > 0 ) {
			System.out.println("Not going anywhere for a while, " + name + "?");
		}
	}

}
