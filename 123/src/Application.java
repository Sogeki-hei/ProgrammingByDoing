// Haruka Kasugano 17/03/2015
import java.io.*;
import java.util.*;

public class Application {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which file would you like to read numbers from: ");
		String choice = sc.next();
	    BufferedReader in = new BufferedReader ( new FileReader (choice));
	    System.out.print("Reading numbers from file \"" + choice + "\"...");
	    int first = Integer.parseInt(in.readLine());
	    int second = Integer.parseInt(in.readLine());
	    int third = Integer.parseInt(in.readLine());
	    System.out.print("done.\n");
	    System.out.println("\n" + first + " + " + second + " + " + third + " = " + (first+second+third));
	    
	    
    }

}
