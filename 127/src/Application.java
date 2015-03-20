// Haruka Kasugano 17/03/2015
import java.util.Scanner;
import java.io.*;

public class Application {
	public static void main(String[] args) throws Exception {
		int i = -1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Open which file: ");
	    String file = sc.next();
	    Scanner scf = new Scanner( new BufferedReader ( new FileReader(file) ) );
	    String message = scf.nextLine();
	    while ( i < (message.length() - 3 )) {
	    	i += 3;
	    	char c = message.charAt(i);
	    	System.out.print(c);
	    }
    }

}
