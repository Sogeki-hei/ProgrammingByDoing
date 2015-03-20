// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int current = 0, price = 10, counter = 1;

		System.out.println("Ye Olde Keychain Shoppe");

		while (counter == 1) {
			System.out.println("\n1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println("\nPlease enter your choice: ");
			int choice = sc.nextInt();

			if (choice == 1) {
				current = add_keychains(current);
			}
			if (choice == 2) {
				current = remove_keychains(current);
			}
			if (choice == 3)
				view_order(current, price);
			if (choice == 4)
				checkout(current, price);

		}
	}

	public static int add_keychains(int total) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have " + total
		        + " keychains. How many to add?");
		int i = sc.nextInt();
		total += i;
		System.out.println("You now have " + total + " keychains.");
		return total;
	}

	public static int remove_keychains(int current) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have " + current
		        + " keychains. How many to remove?");
		int i = sc.nextInt();
		current -= i;
		System.out.println("You now have " + current + " keychains.");
		return current;

	}

	public static void view_order(int current, int price) {
		System.out.println("\nYou have " + current + " keychains.");
		System.out.println("Keychains cost $" + price + " each.");
		System.out.println("Total cost is $" + current * price + ".");
	}

	public static void checkout(int current, int price) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWhat is your name? ");
		String name = sc.next();
		System.out.println("You have " + current + " keychains.");
		System.out.println("Keychains cost $" + price + " each.");
		System.out.println("Total cost is $" + current * price + ".");
		System.out.println("Thanks for your order, " + name + "!");
		System.exit(0);
	}

}
