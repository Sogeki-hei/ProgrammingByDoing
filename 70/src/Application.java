// Haruka Kasugano 14/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

		System.out.println("What is your message? ");
		message = sc.nextLine();
		int length = message.length();
		int last = length - 1;

		System.out.println("Your message is " + message.length()
				+ " characters long.");
		System.out.println("The first character is at position 0 and is '"
				+ message.charAt(0) + "'");
		System.out.println("The first character is at position " + last
				+ " and is '" + message.charAt(message.length() - 1) + "'\n");
		System.out.println("Here are all the characters, one at a time: \n");

		for (int i = 0; i < length; i++) {
			System.out.println(i + " - '" + message.charAt(i) + "'");
			if (message.charAt(i) == 'a') {
				n1++;
			}
			if (message.charAt(i) == 'A') {
				n1++;
			}
			if (message.charAt(i) == 'i') {
				n2++;
			}
			if (message.charAt(i) == 'I') {
				n2++;
			}
			if (message.charAt(i) == 'u') {
				n3++;
			}
			if (message.charAt(i) == 'U') {
				n3++;
			}
			if (message.charAt(i) == 'e') {
				n4++;
			}
			if (message.charAt(i) == 'E') {
				n4++;
			}
			if (message.charAt(i) == 'o') {
				n5++;
			}
			if (message.charAt(i) == 'O') {
				n5++;
			}
			

		}
		System.out.println("Your message contains the letter 'a/A' " + n1 + " times.");
		System.out.println("Your message contains the letter 'i/I' " + n2 + " times.");
		System.out.println("Your message contains the letter 'u/U' " + n3 + " times.");
		System.out.println("Your message contains the letter 'e/E' " + n4 + " times.");
		System.out.println("Your message contains the letter 'o/O' " + n5 + " times.");

	}
}
