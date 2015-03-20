// Haruka Kasugano 5/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		
		double First, Second, Last;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		First = keyboard.nextDouble();
		System.out.println("What is your second number?");
		Second = keyboard.nextDouble();
		System.out.println("What is your last number?");
		Last = keyboard.nextDouble();
		
		System.out.println("( " + First + " + " + Second + " + " + Last + " ) / 2 is... " + (First + Second + Last)/2);
		
	}

}
