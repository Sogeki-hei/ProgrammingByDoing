// Haruka Kasugano 17/03/2015

public class Application {
	public static void main(String[] args) {
	    
		for ( int i = 1; i <= 9; i++ ) {
			for ( int n = 0; n <= 9; n++) {
				System.out.print(i);
				System.out.print(n);
				System.out.print(", " + i + "+" + n + " = " + (i + n) + "\r");
			}
		}
    }

}
