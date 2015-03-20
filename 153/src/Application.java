// Haruka Kasugano 18/03/2015
import java.io.*;
import java.util.*;

class dogs {
  String breed;
  int age;
  double weight;
}
public class Application{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which file to open: ");
    String file = sc.next();
    Scanner f = new Scanner( new BufferedReader( new FileReader(file)));
    System.out.println("\nReading data from " + file);
   
    dogs dog1 = new dogs();
    dog1.breed = f.next();
    dog1.age = f.nextInt();
    dog1.weight = f.nextDouble();
    
    dogs dog2 = new dogs();
    dog2.breed = f.next();
    dog2.age = f.nextInt();
    dog2.weight = f.nextDouble();
    
    System.out.println("\nFirst dog: " + dog1.breed + ", " + dog1.age + ", " + dog1.weight);
    System.out.println("Second dog: " + dog2.breed + ", " + dog2.age + ", " + dog2.weight);
    
  }
  

}
