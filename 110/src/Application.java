// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
	    int nbr;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Choose a number: ");
	    nbr = sc.nextInt();
	    System.out.println("");
	    
	    for ( int i = 1; i <= 12; i++ ) {
	    	System.out.println(nbr + "x" + i + " = " + nbr*i);
	    }
    }

}
