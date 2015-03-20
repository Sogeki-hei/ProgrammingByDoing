// Haruka Kasugano 17/03/2015
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
	    PrintWriter out = new PrintWriter ("letter.txt");
		out.println("+-----------------------------------------+");
		out.println("|                                    #### |");
		out.println("|                                    #### |");
		out.println("|                                    #### |");
		out.println("|                                         |");
		out.println("|                                         |");
	    out.println("|               Haruka Kasugano           |");
		out.println("|               Akihabara                 |");
		out.println("|               Chiyoda, Tokyo 101-0047   |");
		out.println("|                                         |");
		out.println("+-----------------------------------------+");
		out.close();
	 
    }

}
