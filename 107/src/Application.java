// Haruka Kasugano 16/03/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
	    
		double a, b = 0, c = 0;
		String op;
		Scanner sc = new Scanner(System.in);
		int route;
		
		while ( true ) {
			System.out.println("<");
			a = sc.nextDouble();
			op = sc.next();
			if ( a == 0 ) {
				System.out.println("Bye, now");
				break;
			}
			else if ( op.equals("!") || op.equals("cos") || op.equals("sin") || op.equals("tan")) {
				route = 2;
			}
			else {
				b = sc.nextDouble();
				route = 1;
			}
			
			if ( route == 1 ) {
				c = OperationSimple(a,op,b);
			}
			else if ( route == 2 ) {
				c = OperationHard(a,op);
			}
				
		}
    }
	public static double OperationSimple(double a, String op, double b) {
		double c = 0;
		if ( op.equals("+")) {
			c = a + b;
			System.out.println( c );
		}
		else if ( op.equals("-")) {
			c = a - b;
			System.out.println( c );
		}
		else if ( op.equals("*")) {
			c = a * b;
			System.out.println( c );
		}
		else if ( op.equals("/")) {
			c = a / b;
			System.out.println( c );
		}
		else if ( op.equals("^")) {
			for ( int i = 0; i < b; i++) {
				a *= a;
			}
			c = a;
			System.out.println( c );
		}
		else if ( op.equals("%")) {
			c = a % b;
			System.out.println( c );
		}
		return c;
	}
	public static double OperationHard ( double a, String op ) {
		double c = 0;
		if ( op.equals("!")) {
			double sum = 1;
			for ( int i = 1; i <= a; i++) {
				sum = sum * i;
			}
			c = sum;
			System.out.println( c );
		}
		else if ( op.equals("sin")) {
			c = Math.sin(a);
			System.out.println( c );
		}
		else if ( op.equals("cos")) {
			c = Math.cos(a);
			System.out.println( c );
		}
		else if ( op.equals("tan")) {
			c = Math.tan(a);
			System.out.println( c );
		}
		return c;
	}

}
