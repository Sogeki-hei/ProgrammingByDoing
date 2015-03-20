// Haruka Kasugano 18/03/2015
import java.util.*;
import java.io.*;

class person {
  String name;
  int age;
  
  public String toString() {
    return ( this.name + " is " + this.age );
  }
}
public class Application {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner ( System.in );
    person[] persons = new person[5];
    
    System.out.print("Which file to open: ");
    String file = sc.next();
    Scanner f = new Scanner( new BufferedReader ( new FileReader ( file )));
    System.out.println("Reading data from " + file + "\n");
    
    for ( int i = 0; i < persons.length; i++ ) {
      persons[i] = new person();
      persons[i].name = f.next();
      persons[i].age = f.nextInt();
      System.out.println(persons[i]);
    }
  }
  

}
