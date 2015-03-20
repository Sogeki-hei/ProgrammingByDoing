// Haruka Kasugano 14/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {

		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		int[] Pro = new int[100];
		int easy = Pro.length / 2;
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, sum1 = 0, sum2 = 0, New, route = 1;
		String input;

		for (int i = 0; i <= easy; i++) {
			Pro[i] = 10 + rm.nextInt(2);
		}
		for (int i = 49; i < Pro.length; i++) {
			Pro[i] = 2 + rm.nextInt(8);
		}
		System.out.println("Welcome to Shihao's BLACKJACK PROGRAMME!");
		while (route != 0) {
			if (route == 1) {
				x1 = Pro[rm.nextInt(100)];
				x2 = Pro[rm.nextInt(100)];
				sum1 = x1 + x2;
				System.out.println("You get a " + x1 + " and " + x2 + ".");
				if (sum1 > 21) {
					System.out.println("Your total is " + (sum1)
					        + ". You get busted.");
					System.out.println("\nYOU LOSE!");
					route = 0;
					break;
				} else {
					System.out.println("Your total is " + (sum1) + ".");
					route = 2;
				}

			}
			if (route == 2) {

				y1 = Pro[rm.nextInt(100)];
				y2 = Pro[rm.nextInt(100)];
				sum2 = y1 + y2;
				System.out.println("The dealer has a " + y1
				        + " showing, and a hidden card.");
				if (sum2 > 21) {
					System.out.println("Dealer's total is " + (sum2)
					        + ". Dealer get busted.");
					System.out.println("\nYOU WIN!");
					route = 0;
					break;
				} else {
					System.out.println("His total is hidden, too.");
					route = 3;
				}

			}
			while (route == 3) {
				System.out.println("Would you like to \"hit\" or \"stay\"?");
				input = sc.next();
				if (input.equals("hit")) {
					New = Pro[rm.nextInt(100)];
					System.out.println("You drew a " + New + ".");
					sum1 += New;
					if (sum1 > 21) {
						System.out.println("Your total is " + (sum1)
						        + ". You get busted.");
						System.out.println("\nYOU LOSE!");
						route = 0;
						break;

					} else {
						System.out.println("Your total is " + (sum1) + ".");
						route = 3;
					}

				}
				if (input.equals("stay")) {
					route = 4;
				}
			}
			while (route == 4) {
				System.out.println("\nOkay, dealer's turn.");
				System.out.println("His hidden card was a " + y2 + ".");
				System.out.println("His total was " + sum2 + ".");
				if (sum2 <= 16) {
					New = Pro[rm.nextInt(100)];
					sum2 += New;
					System.out.println("Dealer chooses to hit.");
					System.out.println("He draws a " + New + ".");
					if (sum2 > 21) {
						System.out.println("Dealer's total is " + (sum2)
						        + ". Dealer get busted.");
						System.out.println("\nYOU WIN!");
						route = 0;
						break;
					} else {
						System.out.println("Dealer's total is " + sum2 + ".");
					}
					route = 4;
				} else if (sum2 > 16) {
					System.out.println("Dealer decided to stay.");
					route = 5;
				}

			}
			if ( route == 5 ) {
				System.out.println("Dealer's total is " + sum2 + ".");
				System.out.println("Your total is " + sum1 + ".");

				if (sum1 > sum2) {
					System.out.println("YOU WIN!");
					route = 0;
					break;
				}
				if (sum1 < sum2) {
					System.out.println("YOU LOSE!");
					route = 0;
					break;
				}
				if (sum1 == sum2) {
					System.out.println("DRAW!");
					route = 0;
					break;
				}

			}
			
		}
	}
}