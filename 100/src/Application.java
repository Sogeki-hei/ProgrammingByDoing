// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i = 1;
	    
	    System.out.println("Ye Olde Keychain Shoppe");
	    
	    while ( i != 0 ) {
	    System.out.println("\n1. Add Keychains to Order");
	    System.out.println("2. Remove Keychains from Order");
	    System.out.println("3. View Current Order");
	    System.out.println("4. Checkout");
	    System.out.println("Please enter your choice: ");
	    int choice = sc.nextInt();
	    
	    if ( choice == 1 ) 
	    	add_keychains();
	    if ( choice == 2 )
	    	remove_keychains();
	    if ( choice == 3 ) 
	    	view_order();
	    if ( choice == 4 )
	    	checkout();
	    
	    }
	    
	    
    }
	public static void add_keychains() {
		int i;
		System.out.println("\nADD KEYCHAINS");
		i = 1;
	}
	public static void remove_keychains() {
		int i;
		System.out.println("\nREMOVE KEYCHAINS");
		i = 1;
	}
	public static void view_order() {
		int i;
		System.out.println("\nVIEW ORDER");
		i = 1;
	}
	public static void checkout() {
		System.out.println("\nCHECKOUT");
		System.exit(0);
	}

}
