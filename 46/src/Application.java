// Haruka Kasugano 8/3/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int roll1, roll2;
		Random generator = new Random();
		roll1 = 1 + generator.nextInt(6);
		roll2 = 1 + generator.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println("\nRoll #1: " + roll1);
		System.out.println("Roll #2: " + roll2);
		System.out.println("The total is " + ( roll1 + roll2 ));
		
		while ( roll1 != roll2 ) {
			roll1 = 1 + generator.nextInt(6);
			roll2 = 1 + generator.nextInt(6);
			System.out.println("\nRoll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			System.out.println("The total is " + ( roll1 + roll2 ));
		}
		System.out.println("You got a double!");
				
	}

}
