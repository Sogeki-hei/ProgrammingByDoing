// Haruka Kasugano 17/03/2015

public class Application {
	public static void main(String[] args) {
		for ( int i = 1; i <= 9; i++ ) {
			for ( int n = 0; n <= 9; n++ ) {
				for ( int v = 0; v <= 9; v++ ) {
					double n1 = Math.pow(i, 3);
					double n2 = Math.pow(n, 3);
					double n3 = Math.pow(v, 3);
					double total = Integer.parseInt(String.valueOf(i) + String.valueOf(n) + String.valueOf(v));
					if ( (n1 + n2 + n3) == total ) {
						System.out.println(total);
					}
				}
			}
		}
	}

}
