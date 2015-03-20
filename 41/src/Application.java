// Haruka Kasugano 8/3/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int roll1, roll2;
		Random dice = new Random();
		
		roll1 = 1 + dice.nextInt(6);
		roll2 = 1 + dice.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println("");
		System.out.println("Roll #1: " + roll1);
		System.out.println("Roll #1: " + roll2);
		System.out.println("The total is " + ( roll1 + roll2 ));
	}

}
