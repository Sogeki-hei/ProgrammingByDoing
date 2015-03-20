// Haruka Kasugano 8/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out
				.println("Type in a message, and I'll display it several times.");
		System.out.println("Message: ");
		String message = keyboard.nextLine();
		System.out.println("How many times? ");
		int n = keyboard.nextInt();

		int a = 0;
		while (a < n) {
			System.out.println((a + 1) + ". " + message);
			a++;
		}

	}
}