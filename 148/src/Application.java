// Haruka Kasugano 18/03/2015
import java.net.URL;
import java.util.Scanner;
import java.io.*;

class Address
{
    String street;
    String city;
    String state;
    int zip;
}

public class Application
{
    public static void main(String[] args) throws Exception
    {
        URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
        Scanner fin = new Scanner(new BufferedInputStream (addys.openStream()));

        Address uno = new Address();
        uno.street = fin.nextLine();
        uno.city   = fin.nextLine();
        uno.state  = fin.next();
        uno.zip    = fin.nextInt();
        fin.skip("\n");

        Address dos = new Address();
        dos.street = fin.nextLine();
        dos.city   = fin.nextLine();
        dos.state  = fin.next();
        dos.zip    = fin.nextInt();
        fin.skip("\n");

        Address tre = new Address();
        tre.street = fin.nextLine();
        tre.city   = fin.nextLine();
        tre.state  = fin.next();
        tre.zip    = fin.nextInt();
        fin.skip("\n");
        
        Address idont = new Address();
        idont.street = fin.nextLine();
        idont.city   = fin.nextLine();
        idont.state  = fin.next();
        idont.zip    = fin.nextInt();
        fin.skip("\n");
        
        Address eh = new Address();
        eh.street = fin.nextLine();
        eh.city   = fin.nextLine();
        eh.state  = fin.next();
        eh.zip    = fin.nextInt();
        fin.skip("\n");
        
        fin.close();
        
        System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
        System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
        System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
        System.out.println(idont.street + ", " + idont.city + ", " + idont.state + "  " + idont.zip);
        System.out.println(eh.street + ", " + eh.city + ", " + eh.state + "  " + eh.zip);
    }
}

