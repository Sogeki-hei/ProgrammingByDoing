// Haruka Kasugano 7/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		String gender, marriage, fName, lName;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your gender ( M or F ): ");
		gender = keyboard.nextLine();
		System.out.println("First name: ");
		fName = keyboard.nextLine();
		System.out.println("Last name: ");
		lName = keyboard.nextLine();
		System.out.println("Age: ");
		age = keyboard.nextInt();
		
		if ( gender.equals("M") && age >= 20 ) {
			System.out.println("Then I shall call you Mr. " + lName);
		}
		if ( gender.equals("M") && age < 20 ) {
			System.out.println("Then I shall call you " + fName + " " + lName);
		}
		if ( gender.equals("F") && age >= 20 ) {
			System.out.println("Are you married, " + fName + " (y or n)? ");
			marriage = keyboard.next();
			
			if ( marriage.equals("y") ) {
				System.out.println("Then I shall call you Mrs. " + fName );
			}
			else if ( marriage.equals("n") ) {
				System.out.println("Then I shall call you Ms. " + fName );
			}
		}
		if ( gender.equals("F") && age < 20 ) {
			System.out.println("Then I shall call you " + fName + " " + lName);
		}
	}
}