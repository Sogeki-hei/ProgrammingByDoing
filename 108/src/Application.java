// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
	    String name;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("What is your name: ");
	    name = sc.next();
	    
	    if ( name.equals("Shihao")) {
	    	for ( int i = 1; i <= 5; i++) {
	    		System.out.println(name);
	    	}
	    }
	    else {
	    	for ( int i = 1; i <= 10; i++) {
	    		System.out.println(name);
	    	}
	    }
    }

}
