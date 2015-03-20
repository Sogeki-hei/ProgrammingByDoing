// Haruka Kasugano 8/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		int nbr = 4, input;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("");
		System.out.println("I'M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		input = keyboard.nextInt();
		
		if ( nbr == input ) {
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + nbr + " !");
		}
		else {
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + nbr + "!");
		}
	}

}
