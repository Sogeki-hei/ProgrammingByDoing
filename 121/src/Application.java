// Haruka Kasugano 17/03/2015
import java.util.Scanner;
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter (new FileWriter ( "High Score.txt"));
		Scanner sc = new Scanner(System.in);
	    System.out.println("You got a high score!\r");
	    System.out.println("Please enter your score: ");
	    int score = sc.nextInt();
	    out.println(score);
	    System.out.println("Please enter your name: ");
	    String name = sc.next();
	    out.println(name);
	    out.close();
	    
    }

}
