// Haruka Kasugano 14/03/2015
public class Application {
	public static void main(String[] args) {
	    
		int value = -113;
		int[] Array = new int[10];
		
		for (int i = 0; i < Array.length; i++) {
			Array[0 + i] = value;
			System.out.println("Slot " + i + " contains a " + value);
		}
    }

}
