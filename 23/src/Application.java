// Haruka Kasuagno 5/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		
		double Earth, Venus, Mars, Jupiter, Saturn, Uranus, Neptune;
		int choice;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your current earth weight: ");
		Earth = keyboard.nextDouble();
		Venus = Earth * 0.78;
		Mars = Earth * 0.39;
		Jupiter = Earth * 2.65;
		Saturn = Earth * 1.17;
		Uranus = Earth * 1.05;
		Neptune = Earth * 1.23;
		
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars    3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune");
		System.out.println("");
		System.out.println("Which planet are you visiting? ");
		choice = keyboard.nextInt();
		
		if ( choice == 1 ) {
			System.out.println("Your weight would be " + Venus + " pounds on that planet.");
		}
		if ( choice == 2 ) {
			System.out.println("Your weight would be " + Mars + " pounds on that planet.");
		}
		if ( choice == 3 ) {
			System.out.println("Your weight would be " + Jupiter + " pounds on that planet.");
		}
		if ( choice == 4 ) {
			System.out.println("Your weight would be " + Saturn + " pounds on that planet.");
		}
		if ( choice == 5 ) {
			System.out.println("Your weight would be " + Uranus + " pounds on that planet.");
		}
		if ( choice == 6 ) {
			System.out.println("Your weight would be " + Neptune + " pounds on that planet.");
		}
	}

}
