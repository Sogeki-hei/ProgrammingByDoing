// Haruka Kasugano 6/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		int correct = 0, Reply0, Reply1, Reply2, Reply3;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Are you ready for a quiz?");
		System.out.println("            1) Yes");
		System.out.println("            2) No");
		Reply0 = keyboard.nextInt();

		if (Reply0 == 1) {
			System.out.println("Okay, here it comes!");
			System.out.println("");
			System.out.println("Q1) What is the capital of Alaska?");
			System.out.println("        1) Melobourne");
			System.out.println("        2) Archorage");
			System.out.println("        3) Juneau");
			Reply1 = keyboard.nextInt();

			if (Reply1 == 3) {
				System.out.println("That's right!");
				correct++;
			} else {
				System.out.println("Sorry, the correct answer is Juneau");
			}

			System.out
					.println("Q2) Can you store the calue \"cat\" in a variable of type int?");
			System.out.println("        1) Yes");
			System.out.println("        2) No");
			Reply2 = keyboard.nextInt();

			if (Reply2 == 2) {
				System.out.println("That's right!");
				correct++;
			} else {
				System.out
						.println("Sorry, the correct answer is 2. \"cat\" is a string, ints can only store numbers.");
			}

			System.out.println("Q3) What is the result of 9+6/3?");
			System.out.println("        1) 5");
			System.out.println("        2) 11");
			System.out.println("        3) 15/3");
			Reply3 = keyboard.nextInt();

			if (Reply3 == 2) {
				System.out.println("That's right!");
				correct++;
			} else {
				System.out.println("Sorry, the correct answer is 2");
			}

			System.out.println("Overall, you got " + correct
					+ " out of 3 correct.");
			System.out.println("Thanks for playing!");

		} else {
			System.exit(0);

		}

	}
}
