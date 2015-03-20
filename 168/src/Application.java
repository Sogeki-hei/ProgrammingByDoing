// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void main(String[] args) {
    Random rm = new Random();
    int largest = 0, index = 0;
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    
    for ( int i = 0; i < 10; i++ ) {
      a1.add(1+rm.nextInt(100));
    }
    
    for ( int i = 0; i < a1.size(); i++ ) {
      if ( largest < a1.get(i)) {
        largest = a1.get(i);
        index = i + 1;
      }
    }
    System.out.println("ArrayList: " + a1);
    System.out.println("\nThe largest value is " + largest + ", which is in slot " + index);
  }

}
