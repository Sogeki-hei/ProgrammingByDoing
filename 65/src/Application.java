// Haruka Kasugano 14/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Count from: ");
		int from = sc.nextInt();
		System.out.println("Count to: ");
		int to = sc.nextInt();
		System.out.println("Count by: ");
		int by = sc.nextInt();
		
		for (int i = from; i <= to; i += by) {
			System.out.print(" " + i);
		}
	}

}
