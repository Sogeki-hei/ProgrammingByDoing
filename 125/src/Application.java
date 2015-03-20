// Haruka Kasugano 17/03/2015
import java.io.*;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		int i = 0;
		int total = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Which file would you like to read numbers from: ");
	    String fileName = sc.next();
	    BufferedReader in = new BufferedReader ( new FileReader(fileName));
	    Scanner scf = new Scanner(in);
	    while ( scf.hasNext() ) {
	    	i = scf.nextInt();
	    	total += i;
	    	
	    }
	    System.out.println("Total is " + total );
    }

}
