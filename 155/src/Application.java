// Haruka Kasugano 18/03/2015
import java.util.*;
import java.io.*;

class Car {
  String make;
  String model;
  int year;
  String nbr;
  
  public String toString ( ) {
    return ( make + " " + model + " " + year + " " + nbr );
  }
}
public class Application {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many profiles do you want to create? ");
    System.out.print("> ");
    int count = sc.nextInt();
    
    Car[] cars = new Car[count];
    for ( int i = 0; i < cars.length; i++ ) {
      cars[i] = new Car();
      System.out.println("Car " + (i + 1) + "\t");
      System.out.print("\tMake: ");
      cars[i].make = sc.next();
      System.out.print("\tModel: ");
      cars[i].model = sc.next();
      System.out.print("\tYear: ");
      cars[i].year = sc.nextInt();
      System.out.print("\tLicense: ");
      cars[i].nbr = sc.next();
    }
    System.out.print("\nTo which file do you want to save this information? ");
    String file = sc.next();
    PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( file)));
    for ( int n = 0; n < cars.length; n++ ) {
      out.println(cars[n]);
    }
    out.close();
    System.out.println("\nData saved.");
  }

}
