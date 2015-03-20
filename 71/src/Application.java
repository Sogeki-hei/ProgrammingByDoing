// Haruka Kasugano 14/3/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type in a sequence in the pattern of x_y_z.");
		String userinput = sc.next();
		
		int one,two;
		one = userinput.indexOf('_');
		two = userinput.lastIndexOf('_');
		String x = userinput.substring(0, one);
		String y = userinput.substring(one + 1, two);
		String z = userinput.substring(two + 1);
		
		int X = Integer.parseInt(x);
		int Y = Integer.parseInt(y);
		int Z = Integer.parseInt(z);
		
		long original = X + Y;
		int Final = 1;
		for ( int i = 1; i <= Z; i++) {
			Final *= original;
		}
		System.out.println(Final);
		System.exit(0);
	}

}