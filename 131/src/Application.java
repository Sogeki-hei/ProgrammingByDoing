// Haruka Kasugano 17/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random rm = new Random();
	    int[] Array = new int[10];
	    boolean num = false;
	    int times = 0;
	    while ( true ) {
	    System.out.print("\rArray: ");
	    for ( int i = 0; i < 10; i++ ) {
	    	Array[i] = 1 + rm.nextInt(50);
	    	System.out.print(Array[i] + " ");
	    }
	    System.out.println();
	    System.out.println("\rValue to find: ");
	    int value = sc.nextInt();
	    if ( value == 0 ) {
	    	System.exit(0);
	    }
	    for ( int i = 0; i < 10; i++ ) {
	    	if ( Array[i] == value) {
	    		num = true;
	    		times ++;
	    	}
	    }
	    System.out.println(value + " was found " + times + " times.");
    }
	}

}
