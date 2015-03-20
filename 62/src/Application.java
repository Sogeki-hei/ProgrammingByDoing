// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		String p1, p2, input;
		int a = 3, b = 5, c = 7, minus, route = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Player 1, enter your name: ");
		p1 = sc.next();
		System.out.println("Player 2, enter your name: ");
		p2 = sc.next();

		while (route != 0) {
			if (route == 1) {

				String star1 = "";
				StringBuffer bf1 = new StringBuffer(star1);
				for (int i = 0; i < a; i++) {
					bf1.append("*");
				}
				String A = bf1.toString();
				System.out.println("A: " + A);

				String star2 = "";
				StringBuffer bf2 = new StringBuffer(star2);
				for (int i = 0; i < b; i++) {
					bf2.append("*");
				}
				String B = bf2.toString();
				System.out.println("B: " + B);

				String star3 = "";
				StringBuffer bf3 = new StringBuffer(star3);
				for (int i = 0; i < c; i++) {
					bf3.append("*");
				}
				String C = bf3.toString();
				System.out.println("C: " + C);
				System.out.println(p1 + ", Choose a pile: ");

				input = sc.next();

				if (input.equals("A")) {
					System.out.println("How many to remove from pile A: ");
					minus = sc.nextInt();
					if (minus <= a && minus > 0) {
						a = a - minus;
						route = 2;
					} else {
						System.out.println(p1 + ", nice try.");
						route = 1;
					}
					if (minus == 0) {
						System.out.println("You must choose at least one.");
						route = 1;
					}
				} else if (input.equals("B")) {
					System.out.println("How many to remove from pile B: ");
					minus = sc.nextInt();
					if (minus <= b && minus > 0) {
						b = b - minus;
						route = 2;
					} else {
						System.out.println(p1 + ", nice try.");
						route = 1;
					}
					if (minus == 0) {
						System.out.println("You must choose at least one.");
						route = 1;
					}

				} else if (input.equals("C")) {
					System.out.println("How many to remove from pile C: ");
					minus = sc.nextInt();
					if (minus <= c && minus > 0) {
						c = c - minus;
						route = 2;
					}

					else {
						System.out.println(p1 + ", nice try.");
						route = 1;
					}
					if (minus == 0) {
						System.out.println("You must choose at least one.");
						route = 1;
					}

				} else {
					if (!input.equals("A") && !input.equals("B")
							&& !input.equals("C")) {
						System.out.println("INPUT ERROR. PLEASE ENTER AGAIN");
						route = 1;
					}
				}

				if ((a == 1 && b == 0 && c == 0)
						|| (a == 0 && b == 1 && c == 0)
						|| (a == 0 && b == 0 && c == 1)) {
					System.out
							.println(p2
									+ ", you must take the last remaining counter, so you lose. "
									+ p1 + " wins!");
					route = 0;
				}
			}

			if (route == 2) {

				String star1 = "";
				StringBuffer bf1 = new StringBuffer(star1);
				for (int i = 0; i < a; i++) {
					bf1.append("*");
				}
				String A = bf1.toString();
				System.out.println("A: " + A);

				String star2 = "";
				StringBuffer bf2 = new StringBuffer(star2);
				for (int i = 0; i < b; i++) {
					bf2.append("*");
				}
				String B = bf2.toString();
				System.out.println("B: " + B);

				String star3 = "";
				StringBuffer bf3 = new StringBuffer(star3);
				for (int i = 0; i < c; i++) {
					bf3.append("*");
				}
				String C = bf3.toString();
				System.out.println("C: " + C);
				System.out.println(p2 + ", Choose a pile: ");
				input = sc.next();

				if (input.equals("A")) {
					System.out.println("How many to remove from pile A: ");
					minus = sc.nextInt();
					if (minus <= a && minus > 0) {
						a = a - minus;
						route = 1;
					}

					else
						System.out.println(p2 + ", nice try.");
					if (minus == 0) {
						System.out.println("You must choose at least one.");
						route = 1;
					}
				} else if (input.equals("B")) {
					System.out.println("How many to remove from pile B: ");
					minus = sc.nextInt();
					if (minus <= b && minus > 0) {
						b = b - minus;
						route = 1;
					} else
						System.out.println(p2 + ", nice try.");
					if (minus == 0) {
						System.out.println("You must choose at least one.");
						route = 1;
					}

				} else if (input.equals("C")) {
					System.out.println("How many to remove from pile C: ");
					minus = sc.nextInt();
					if (minus <= c && minus > 0) {
						c = c - minus;
						route = 1;
					}

					else
						System.out
								.println("Surely you can't take more than what it has.");
					if (minus == 0) {
						System.out.println(p2 + ", nice try.");
						route = 1;
					}

				} else {
					if (!input.equals("A") && !input.equals("B")
							&& !input.equals("C")) {
						System.out.println("INPUT ERROR. PLEASE ENTER AGAIN");
						route = 1;
					}
				}

				if ((a == 1 && b == 0 && c == 0)
						|| (a == 0 && b == 1 && c == 0)
						|| (a == 0 && b == 0 && c == 1)) {
					System.out
							.println(p1
									+ ", you must take the last remaining counter, so you lose. "
									+ p2 + " wins!");
					route = 0;
				}

			}
		}

	}

}
