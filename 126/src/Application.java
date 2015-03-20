// Haruka Kasugano 17/03/2015
import java.net.URL;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args) throws Exception
    {
        URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
        Scanner webIn = new Scanner( mcool.openStream() );

        String one = webIn.nextLine();
        
        webIn.close();
        
        System.out.println(one);
    }
}