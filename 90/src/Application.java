// Haruka Kasugano 16/03/2015
import java.util.Random;
import java.util.Random;

public class Application
{
	public static void main( String[] args ) throws Exception
	{
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ )
		{
            r = 1 + rng.nextInt(5);
			
			if ( r == 1 ) {
				first();
				Thread.sleep(600);
			}
			if ( r == 2 ) {
				second();
				Thread.sleep(600);
			}
			if ( r == 3 ) {
				third();
				Thread.sleep(600);
			}
			if ( r == 4 ) {
				fourth();
				Thread.sleep(600);
			}
			if ( r == 5 ) {
				fifth();
				Thread.sleep(600);
			}
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}

