// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		double s1, s2, s3;
		Scanner ui = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		System.out.println("Side 1: ");
		s1 = ui.nextDouble();
		System.out.println("Side 2: ");
		s2 = ui.nextDouble();

		while (s2 < s1) {
			System.out.println(s2 + " is smaller than " + s1 + ". Try again.");
			System.out.println("Side 2: ");
			s2 = ui.nextDouble();
		}

		System.out.println("Side 3: ");
		s3 = ui.nextDouble();

		while (s3 < s2) {
			System.out.println(s3 + " is smaller than " + s2 + ". Try again.");
			System.out.println("Side 3: ");
			s3 = ui.nextDouble();
		}
		
		System.out.println("Your three sides are " + s1 + " " + s2 + " " + s3);
		
		if ( (s1 * s1) + (s2 * s2) != (s3 * s3)) {
			System.out.println("NO!  These sides do not make a right triangle!");
		}
		else 
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");

		System.exit(0);
	}
}
