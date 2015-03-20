// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		double a, b, c;
		String op;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(">");
			a = sc.nextDouble();
			op = sc.next();
			b = sc.nextDouble();

			if (a == 0) {
				System.out.println("Goodbye, now.");
				break;
			}
			if (op.equals("+")) {
				c = a + b;
				System.out.println(c);
			} else if (op.equals("-")) {
				c = a - b;
				System.out.println(c);
			} else if (op.equals("*")) {
				c = a * b;
				System.out.println(c);
			} else if (op.equals("/")) {
				c = a / b;
				System.out.println(c);
			} else {
				System.out.println("Invalid Operator: " + op + ".");
			}

		} while (a != 0);

	}
}
