// Haruka Kasugano 16/03/2015
import java.util.*;
import java.text.DecimalFormat;

public class Application {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int current = 0, counter = 1;
		double price = 1, shipping = 5, per = 1;

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
				view_order(current, price, 0.0825, shipping,
				        per * current);
			if (choice == 4)
				checkout(current, price, 0.0825, shipping, per
				        * current);
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.println("Sorry, that's not a valid option.");
			}

		}
	}

	public static int add_keychains(int total) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have " + total
		        + " keychains. How many to add?");
		int i = sc.nextInt();
		while (i < 0) {
			System.out.println("Sorry, that's not a valid amount.");
			System.out.println("\nYou have " + total
			        + " keychains. How many to add?");
			i = sc.nextInt();
		}
		total += i;
		System.out.println("You now have " + total + " keychains.");
		return total;
	}

	public static int remove_keychains(int current) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have " + current
		        + " keychains. How many to remove?");
		int i = sc.nextInt();
		while (i > current || i <= 0) {
			System.out.println("Sorry, that's not a valid amount.");
			System.out.println("\nYou have " + current
			        + " keychains. How many to remove?");
			i = sc.nextInt();
		}
		current -= i;
		System.out.println("You now have " + current + " keychains.");
		return current;

	}

	public static void view_order(int current, double price, double tax,
	        double shipping, double per) {
		double cost = price, sco = (shipping + per), bf = (current * price
		        + (shipping + per)), tx = ((current * price + (shipping + per)) * tax), fl = (((current * price + (shipping + per)) * tax) + current
                        * price + (shipping + per));
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("\nYou have " + current + " keychains.");
		System.out.println("Keychains cost $" + (f.format(cost)) + " each.");
		System.out.println("Shipping charge is $" + (f.format(sco)) + ".");
		System.out.println("Subtotal before tax is $" + (f.format(bf)) + ".");
		System.out.println("Tax on the order is $"
		        + (f.format(tx)) + ".");
		System.out
		        .println("Final cost of the order is $"
		                + (f.format(fl)) + ".");
	}

	public static void checkout(int current, double price, double tax,
	        double shipping, double per) {
		Scanner sc = new Scanner(System.in);
		double cost = price, sco = (shipping + per), bf = (current * price
		        + (shipping + per)), tx = ((current * price + (shipping + per)) * tax), fl = (((current * price + (shipping + per)) * tax) + current
                        * price + (shipping + per));
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("\nWhat is your name? ");
		String name = sc.next();
		System.out.println("\nYou have " + current + " keychains.");
		System.out.println("Keychains cost $" + (f.format(cost)) + " each.");
		System.out.println("Shipping charge is $" + (f.format(sco)) + ".");
		System.out.println("Subtotal before tax is $" + (f.format(bf)) + ".");
		System.out.println("Tax on the order is $"
		        + (f.format(tx)) + ".");
		System.out
		        .println("Final cost of the order is $"
		                + (f.format(fl)) + ".");
		System.out.println("Thanks for your order, " + name + "!");
		System.exit(0);
	}

}
