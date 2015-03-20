// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int nbr = sc.nextInt();
		for (int i = 2; i <= nbr; i++) {
			System.out.print("\n" + i + " ");
			if (isPrime(i)) {
				System.out.print("<");
			}
		}
	}
}
