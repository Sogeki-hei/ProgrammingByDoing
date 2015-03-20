// Haruka Kasugano 8/3/2015
import java.util.Scanner;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int correct, choice;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		correct = 1 + generator.nextInt(3);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		System.out.println("");
		System.out.println("Which one is the ace?");
		System.out.println("");
		System.out.println("        ##  ##  ##");
		System.out.println("        ##  ##  ##");
		System.out.println("        1   2   3");
		System.out.println("");
		System.out.println("");
		System.out.println("> ");
		choice = keyboard.nextInt();
		System.out.println("");
		
		if ( choice != correct )
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + correct + ".");
		if ( choice == correct )
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		System.out.println("");
		if ( correct == 1 ) {
			System.out.println("        AA  ##  ##");
			System.out.println("        AA  ##  ##");
			System.out.println("        1   2   3");
		}
		if ( correct == 2 ) {
			System.out.println("        ##  AA  ##");
			System.out.println("        ##  AA  ##");
			System.out.println("        1   2   3");
		}
		if ( correct == 3 ) {
			System.out.println("        ##  ##  AA");
			System.out.println("        ##  ##  AA");
			System.out.println("        1   2   3 ");
		}
		
		
	}

}
