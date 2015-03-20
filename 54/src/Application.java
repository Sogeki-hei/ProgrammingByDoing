// Haruka Kasugano
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int roll1, roll2, total;
		Random generator = new Random();
		
		System.out.println("HERE COME THE DICE!");
		System.out.println("");
		
		do {
			roll1 = 1 + generator.nextInt(6);
			roll2 = 1 + generator.nextInt(6);
			total = roll1 + roll2;
			System.out.println("Roll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			System.out.println("");
			System.out.println("The total is " + total + "!");
		} while ( roll1 != roll2 );
		
		
	}

}
