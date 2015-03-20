// Haruka Kasugano 12/3/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in a message, and I'll display it whatever number of times you want.");
		System.out.print("Message: ");
		String message = sc.nextLine();
		System.out.println("Times: ");
		int times = sc.nextInt();
		
		for ( int i = 1; i <= times; i++) {
			System.out.println(i + ". " + message);
		}
	}

}
