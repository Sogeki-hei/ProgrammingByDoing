// Haruka Kasugano 16/03/2015

// Fill-In Functions - Fix the broken functions and function calls.

public class Application
{
	public static void main( String[] args )
	{
		// Fill in the function calls where appropriate.

		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = randchar();;
		randchar();
		System.out.println("The character is: " + c );

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(begin,end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x = -10;
		System.out.println("|" + x + "| = " + abso(x) );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}

	public static void credits() 
	{
		System.out.println("programmed by Li Shihao");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

	}


	public static char randchar()
	{
		
		int numval;
		char charval;
		numval = (int)(Math.random()*26);
		charval = (char) ('A' + numval);
		return charval;

	}
	


	public static void counter( int begin, int end )
	{
		int ctr;

		ctr = begin;
		while ( ctr <= end )
		{
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}
		

	}


	public static int abso( int x )
	{
		int absval;

		if ( x < 0 )
			absval = -x;
		else
			absval = x;

		return absval;
	}

}
