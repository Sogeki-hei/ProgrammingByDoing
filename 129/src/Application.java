// Haruka Kasugano 17/03/2015
import java.util.*;
import java.io.*;

public class Application {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int[] Array = new int[5];
	    System.out.println("Name ( first last ): ");
	    String name = sc.nextLine();
	    System.out.println("Filename: ");
	    String fileName = sc.nextLine();
	    
	    Random rm = new Random();
	    System.out.println("Here are your randomly-selected grades ( hope you pass ): ");
	    Array[0] = 1 + rm.nextInt(100);
	    System.out.println("Grade 1: " + Array[0]);
	    Array[1] = 1 + rm.nextInt(100);
	    System.out.println("Grade 2: " + Array[1]);
	    Array[2] = 1 + rm.nextInt(100);
	    System.out.println("Grade 3: " + Array[2]);
	    Array[3] = 1 + rm.nextInt(100);
	    System.out.println("Grade 4: " + Array[3]);
	    Array[4] = 1 + rm.nextInt(100);
	    System.out.println("Grade 5: " + Array[4]);
	    
	    PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter (fileName)));
	    out.println(name);
	    out.println(Array[0] + " " + Array[1] + " " + Array[2] + " " + Array[3] + " " + Array[4]);
	    out.close();
    }

}
