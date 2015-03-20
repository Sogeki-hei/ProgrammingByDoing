// Haruka Kasugano 7/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		String first, second;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("");
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println("");
		System.out
				.println("Question 1) Does it stay inside or outside or both? ");
		first = keyboard.nextLine();

		System.out.println("Question 2) Is it a living thing? ");
		second = keyboard.nextLine();

		if (first.equals("inside") && second.equals("yes")) {
			System.out.println("Then what else could you be thinking of besides a houseplant?!?");
		}
		if (first.equals("inside") && second.equals("no")) {
			System.out.println("Then what else could you be thinking of besides a shower curtain?!?");
		}
		if (first.equals("outside") && second.equals("yes")) {
			System.out.println("Then what else could you be thinking of besides a bison?!?");
		}
		if (first.equals("outside") && second.equals("no")) {
			System.out.println("Then what else could you be thinking of besides a billboard?!?");
		}
		if (first.equals("both") && second.equals("yes")) {
			System.out.println("Then what else could you be thinking of besides a dog?!?");
		}
		if (first.equals("both") && second.equals("no")) {
			System.out.println("Then what else could you be thinking of besides a cell phone?!?");
		}

	}
}
