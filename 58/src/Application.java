// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int nbr;
		Scanner sc = new Scanner(System.in);

		System.out.println("Starting number: ");
		nbr = sc.nextInt();
		System.out.print(nbr);

		while (nbr != 1) {

			if (nbr % 2 == 0) {
				nbr = nbr / 2;
				System.out.print("      " + nbr);
			} else {
				nbr = nbr * 3 + 1;
				System.out.print("      " + nbr);
			}
		}
	}

}
