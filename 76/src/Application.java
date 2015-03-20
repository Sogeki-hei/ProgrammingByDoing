// Haruka Kasugano 14/03/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
	    
		Random rm = new Random();
		int[] Array = new int [10];
		
		for ( int i = 0; i < Array.length; i++ ) {
			Array[i] = 1 + rm.nextInt(100);
			System.out.println("Slot " + i + " contains a " + Array[i]);
		}
    }

}
