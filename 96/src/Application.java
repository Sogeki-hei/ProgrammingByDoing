// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte route = 1;

		System.out
		        .println("Shape Area Calculator version 0.1 (c) 2015 ShiHao Sample Output, Inc.");

		while (route == 1) {
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("\n1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.println("Which shape: ");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("\nBase: ");
				int base = sc.nextInt();
				System.out.println("Height: ");
				int height = sc.nextInt();
				System.out.println("The area is " + area_triangle(base, height)
				        + ".");
				route = 1;
			}
			if (choice == 2) {
				System.out.println("\nLength: ");
				int length = sc.nextInt();
				System.out.println("Width");
				int width = sc.nextInt();
				System.out.println("The area is "
				        + area_rectangle(length, width) + ".");
				route = 1;
			}
			if (choice == 3) {
				System.out.println("\nSide: ");
				int side = sc.nextInt();
				System.out.println("The area is " + area_square(side) + ".");
				route = 1;
			}
			if (choice == 4) {
				System.out.println("\nRadius: ");
				int radius = sc.nextInt();
				System.out.println("The area is " + area_circle(radius) + ".");
				route = 1;
			}
			if (choice == 5) {
				System.out.println("Goodbye.");
				route = 0;
			}
		}

	}

	public static double area_triangle(int base, int height) {
		double A = (base * height) / 2;
		return A;
	}

	public static int area_rectangle(int length, int width) {
		int A = length * width;
		return A;
	}

	public static int area_square(int side) {
		int A = side * side;
		return A;
	}

	public static double area_circle(int radius) {
		double ¦Ð = Math.PI;
		double A = ¦Ð * (radius * radius);
		return A;
	}

}
