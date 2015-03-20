// Haruka Kasugnao 14/03/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		Random rm = new Random();
		int x1, x2, y1, y2, xsum, ysum;
		
		x1 = 1 + rm.nextInt(10);
		x2 = 1 + rm.nextInt(10);
		y1 = 1 + rm.nextInt(10);
		y2 = 1 + rm.nextInt(10);
		xsum = x1 + x2;
		ysum = y1 + y2;
		
		System.out.println("BABY BLACKJACK!");
		
		System.out.println("You drew " + x1 + " and " + x2 + ".");
		System.out.println("Your total is " + xsum);
		System.out.println("\nThe dealer drew " + y1 + " and " + y2 + ".");
		System.out.println("Dealer's total is " + ysum);
		
		if ( xsum >= ysum )
			System.out.println("YOU WIN!");
		else 
			System.out.println("You lost.");
		
		System.exit(0);
	}

}
