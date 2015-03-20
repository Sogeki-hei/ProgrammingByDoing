// Haruka Kasugano 4/3/2015
public class Application {
	public static void main( String[] args) {
		System.out.println("I will now count my chickens:"); // An introduction
		
		System.out.println("Hens" + " " + (25 + 30 / 6)); // Calculate the number of Hens
		System.out.println("Roosters" + " " + (100 - 25 * 3 % 4)); // Calculate the number of Roosters
		
		System.out.println("Now i will count the eggs:"); // An Introduction
		
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4 + 6); // Calculate the number of eggs
		
		System.out.println("Is it true that 3 + 2 < 5 - 7"); // A question for the viewer
		
		System.out.println( 3 + 2 < 5 - 7); // The < sign makes the machine think of it as boolean and thus giving right or wrong
		
		System.out.println("What is 3 + 2?" + " " + ( 3 + 2 )); // Operation
		System.out.println("What is 5 - 7?" + " " + ( 5 - 7 )); // Operation
		
		System.out.println("Oh, that's why it's false."); // A sentence
		
		System.out.println("How about some more."); // A sentence
		
		System.out.println("Is it greater?" + " " + ( 5 > -2 )); // A question and a boolean answer
		System.out.println("Is it greater or equal?" + " " + ( 5 >= -2 )); // a question and a boolean answer
		System.out.println("Is it less or equal?" + " " + ( 5 <= -2 )); // a question and a boolean answer
		
	}

}
