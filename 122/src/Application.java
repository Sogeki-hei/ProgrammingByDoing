// Haruka Kasugano 17/03/2015
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
		File num = new File("threeNum.txt");
	    BufferedReader in = new BufferedReader ( new FileReader (num));
	    System.out.print("Reading numbers from file \"" + num + "\"...");
	    int first = Integer.parseInt(in.readLine());
	    int second = Integer.parseInt(in.readLine());
	    int third = Integer.parseInt(in.readLine());
	    System.out.print("done.\n");
	    System.out.println("\n" + first + " + " + second + " + " + third + " = " + (first+second+third));
	    
	    
    }

}
