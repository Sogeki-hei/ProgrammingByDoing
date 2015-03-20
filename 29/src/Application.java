// Haruka Kasugano 6/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		String firstresponse, secondresponse;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println("");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		firstresponse = keyboard.nextLine();

		if (firstresponse.equals("animal")) {
			System.out.println("Question 2) Is it bigger than a breadbox?");
			secondresponse = keyboard.nextLine();

			if (secondresponse.equals("yes")) {
				System.out
						.println("My guess is that you are thinking of a moose.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			} else {
				System.out
						.println("My guess is that you are thinking of a squirrel.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			}
		} else if (firstresponse.equals("vegetable")) {
			System.out.println("Question 2) Is it bigger than a breadbox?");
			secondresponse = keyboard.nextLine();

			if (secondresponse.equals("yes")) {
				System.out
						.println("My guess is that you are thinking of a watermelon.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			} else {
				System.out
						.println("My guess is that you are thinking of a carrot.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			}
		} else if (firstresponse.equals("mineral")) {
			System.out.println("Question 2) Is it bigger than a breadbox?");
			secondresponse = keyboard.nextLine();

			if (secondresponse.equals("yes")) {
				System.out
						.println("My guess is that you are thinking of a Camaro.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			} else {
				System.out
						.println("My guess is that you are thinking of a paper clip.");
				System.out
						.println("I would ask you if I'm right, but I don't actually care.");
			}
		}

	}

}
