// Haruka Kasugano 17/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit\r");
			System.out.print("\r> ");
			choice = sc.nextInt();
			
			if ( choice == 1 ) {
				System.out.println();
				for ( int i = 1; i <= 9; i++ ) {
					for ( int n = 0; n <= 9; n++ ) {
						int total = Integer.parseInt(String.valueOf(i) + String.valueOf(n));
						if ( total <= 56 && (i + n) > 10) {
							System.out.print(total + "	");
						}
					}
				}
				System.out.println("\r");
			}
			if ( choice == 2 ) {
				System.out.println();
				for ( int i = 1; i <= 9; i++ ) {
					for ( int n = 0; n <= 9; n++ ) {
						int pos = Integer.parseInt(String.valueOf(i) + String.valueOf(n));
						int rev = Integer.parseInt(String.valueOf(n) + String.valueOf(i));
						if ( (pos - rev) == (i + n) ) {
							System.out.print(pos + "	");
						}
					}
				}
				System.out.println("\r");
			}
			if ( choice == 3 ) {
				break;
			}
		} while ( choice != 3);
	}

}
