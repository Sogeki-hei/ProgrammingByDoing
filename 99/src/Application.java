// More Fill-In Functions - Fix the broken functions and function calls (again).

import java.util.Scanner;

public class Application
{
	public static void main( String[] args )
	{
		// Fill in the function calls where indicated.
		System.out.println("Here we go.");

		System.out.println();
		System.out.println("Some random numbers, if you please: ");
		int lo, hi, val1 = 999, val2 = 999;
		lo = 1;
		hi = 10;
		val1 = superrand(lo, hi);
		System.out.println("First: " + val1 );
		val2 = superrand(hi, lo);  // this time, put hi first
		System.out.println("Second: " + val2 );
		if ( val1 == val2 )
			System.out.println("Hey!  They were the same!");
		else
			System.out.println("They were not the same.");

		System.out.println();
		System.out.print("More counting, but this time not by ones: ");
		stepcount(2, 8, 2);
		stepcount(10, 2, 2);

		System.out.println();
		System.out.println("Let's figure a project grade.");
		int a=4,b=3,c=4,d=5,e=2,f=1, result=999;
		System.out.println("434521 -> " + project_grade(a,b,c,d,e,f));

		System.out.println();
		System.out.print("Finally, some easy ones.");

		String nombre = "ERROR";
		nombre = get_name();
		System.out.println("Hi, " + nombre );

		System.out.println();
		System.out.println("Do you feel lucky, punk?");
		crash();
		System.out.println();
	}


	public static int superrand( int a, int b )
	{
		int c;

		if ( a < b )	// b is larger
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )	// a is larger
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;	// or c = b; doesn't matter since they're equal

		return c;
	}

 	public static void stepcount( int first, int last, int step )
	{

		if ( first < last )
		{
			while ( first <= last )
			{
				System.out.print(first + " ");
				first = first + step;
			}
		}
		else
		{
			while ( first >= last )
			{
				System.out.print(first + " ");
				first = first - step;
			}
		}

	}


	public static int project_grade( int a, int b, int c, int d, int e, int f )
	{

		int overall_grade;

		overall_grade = a * 6;    
		overall_grade = overall_grade + ( b * 6 );   
		overall_grade = overall_grade + ( c * 4 );   
		overall_grade = overall_grade + ( d * 2 );  
		overall_grade = overall_grade + ( e * 1 );   
		overall_grade = overall_grade + ( f * 1 );  

		return overall_grade;
	}
	

	public static String get_name()
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.next();

		return name;
	}


	public static void crash()
	{
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{
			magic_word = "win";
		}
		else
		{
			magic_word = "lose";
		}

		System.out.print("you " + magic_word);

	}

}
