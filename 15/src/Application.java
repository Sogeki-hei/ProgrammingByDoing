// Haruka Kasugano 4/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		String FName, LName, Login;
		int Grade, IBG;
		double ID;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println("First name:");
		FName = keyboard.nextLine();
		System.out.println("Last name:");
		LName = keyboard.nextLine();
		System.out.println("Grade (9-12):");
		Grade = keyboard.nextInt();
		System.out.println("Student ID:");
		ID = keyboard.nextDouble();
		System.out.println("Login:");
		Login = keyboard.next();
		System.out.println("IB Grade");
		IBG = keyboard.nextInt();
		
		System.out.println("");
		System.out.println("                Login:    " + Login);
		System.out.println("                ID:       " + ID);
		System.out.println("                Name:     " + FName + ", " + LName);
		System.out.println("                IB Grade: " + IBG);
		System.out.println("                Grade:    " + Grade);
		
		
	}

}
