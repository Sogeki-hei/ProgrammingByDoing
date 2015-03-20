// Haruka Kasugano
public class Application {
	public static void main(String[] args) {
		int people = 40;
		int cars = 40;
		int buses = 40;

		if (cars > people) { // If the else is removed from else if, the else
								// will follow the one above it and be triggered
								// if the one above if false.
			System.out.println("We should take the cars.");
		}

		else if (cars < people) { // The boolean of else if will be triggered if
									// the boolean of if is false. if the
									// boolean in else if is still false, else
									// will be triggered no matter what.
			System.out.println("We should not take the cars.");
		}

		else {
			System.out.println("We can't decide.");
		}

		if (buses > cars) {
			System.out.println("That's too many buses.");
		}

		else if (buses < cars) {
			System.out.println("Maybe we could take the buses.");
		}

		else {
			System.out.println("We still can't decide.");
		}

		if (people > buses) {
			System.out.println("All right, let's just take the buses.");
		}

		else {
			System.out.println("Fine, let's stay home then.");
		}

	}

}
