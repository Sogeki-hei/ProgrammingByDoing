// Haruka Kasugano 14/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Count to: ");
		int input = sc.nextInt();
		
		for ( int i = 0; i <= input; i++) {
			System.out.print(" " + i);
		}
		
	}

}
