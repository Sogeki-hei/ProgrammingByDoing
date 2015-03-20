// Haruka Kasugano 17/03/2015
import java.util.Scanner;
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
		String line;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Open which file: ");
		String file = sc.next();
		Scanner scf = new Scanner(new BufferedReader(new FileReader(file)));
		while ( scf.hasNext()) {
			System.out.println();
			line = scf.nextLine();
			for ( int i = 0; i < line.length(); i++ ) {
				c = line.charAt(i);
				if ( c == 'a' )
					System.out.print('A');
				else if ( c == 'e' )
					System.out.print('E');
				else if ( c == 'i' )
					System.out.print('I');
				else if ( c == 'o' )
					System.out.print('O');
				else if ( c == 'u' )
					System.out.print('U');
				else 
					System.out.print(c);
			}

		}
		scf.close();
	}

}
