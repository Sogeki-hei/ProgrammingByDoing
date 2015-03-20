// Haruka Kasugano 9/3/2015
import java.util.Random;
import java.util.Scanner;

public class Application
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();

		String again = "y";

		do {
			int flip = generator.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		} while ( again.equals("y") );
	}
}
