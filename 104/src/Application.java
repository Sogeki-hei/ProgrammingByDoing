// Haruka Kasugano 16/03/2015

public class Application {
	public static boolean isEven( int n ) {
		boolean Even;
		if ( n % 2 == 0 ) {
			Even = true;
		}
		else {
			Even = false;
		}
		return Even;
	}
	public static boolean isDivisibleBy3 ( int n ) {
		boolean Three;
		if ( n % 3 == 0 ) {
			Three = true;
		}
		else {
			Three = false;
		}
		return Three;
	}
	public static void main(String[] args) {
	    for ( int i = 1; i <= 20; i++ ) {
	    	System.out.print("\n" + i + " ");
	    	if ( isEven( i ) == true ) {
	    		System.out.print("<");
	    	}
	    	if ( isDivisibleBy3( i ) == true ) {
	    		System.out.print("=");
	    	}
	    }
    }

}
