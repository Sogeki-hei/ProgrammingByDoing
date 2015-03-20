// Haruka Kasugano 14/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Numbers: ");
		int nbr = sc.nextInt();
		
		for ( int i = 1; i <= nbr; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\nThe sum is " + sum + ".");
		
	}

}
