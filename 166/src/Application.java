// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    for ( int i = 0; i < 10; i++ ) {
      a1.add(1 + rm.nextInt(50));
    }
    
    System.out.print("ArrayList: " + a1);
    System.out.print("\nValue to find: ");
    int find = sc.nextInt();
    
    boolean found = false;
    ArrayList<Integer> nbr = new ArrayList<Integer>();
    for ( int i = 0; i < a1.size(); i++ ) {
      int j = a1.get(i);
      if ( j == find ) {
        found = true;
        nbr.add((i + 1));
      }
    }
    
    if ( found == true ) {
      for ( int i = 0; i < nbr.size(); i++ ) {
        System.out.println(find + " is in slot " + nbr.get(i));
      }
    }
    else {
      System.out.println(find + " is not in the ArrayList.");
    }
  }

}
