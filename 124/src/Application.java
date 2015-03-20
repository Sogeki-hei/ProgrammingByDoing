// Haruka Kasugano 17/03/2015
import java.util.Scanner;
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
		System.out.println("Open which file: ");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
	    BufferedReader in = new BufferedReader( new FileReader (file));
	    Scanner scf = new Scanner(in);
	    
	    while( scf.hasNext() == true ) {
	    	System.out.println(scf.next());
	    	
	    }
	    scf.close();
    }
	

}
