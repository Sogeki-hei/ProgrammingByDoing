// Haruka Kasugano 14/03/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
	    
		Random rm = new Random();
		int[] Array1, Array2;
		Array1 = new int[10];
		Array2 = new int[10];
		
		for ( int i = 0; i < Array1.length; i++ ) {
			Array1[i] = 1 + rm.nextInt(100);
		}
		for ( int i = 0; i < Array2.length; i++ ) {
			Array2[i] = Array1[i];
		}
		Array1[9] = -7;
		
		System.out.print("Array 1: ");
		for ( int i = 0; i < Array1.length; i++ ) {
			System.out.print(Array1[i] + "  ");
		}
		System.out.print("\nArray 2: ");
		for ( int i = 0; i < Array2.length; i++ ) {
			System.out.print(Array2[i] + "  ");
		}
    }

}
