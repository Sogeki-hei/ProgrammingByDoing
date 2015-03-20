// Haruka Kasugano 14/03/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
	    
		int[] Array = new int[1000];
		Random rm = new Random();
		
		for ( int i = 0; i < Array.length; i++ ) {
			Array[i] = 10 + rm.nextInt(90);
			System.out.print(Array[i] + "  ");
		}
    }

}
