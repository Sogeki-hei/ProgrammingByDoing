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
    for ( int i = 0; i < a1.size(); i++ ) {
      if ( a1.contains(find) ) {
        found = true;
      }
    }
    if ( found == true ) {
      System.out.println(find + " is in the ArrayList.");
    }
    else {
      System.out.println(find + " is not in the ArrayList.");
    }
  }

}
