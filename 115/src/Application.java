// Haruka Kasugano 17/03/2015

public class Application {
	public static void main(String[] args) {
	    for ( int i = 1; i < 100; i++ ) {
	    	for ( int n = 1; n < 100; n++) {
	    		if ( i + n == 60 && (i - n == 14 | n - i == 14 )) {
	    			System.out.println(i + ", " + n);
	    		}
	    	}
	    }
    }

}
