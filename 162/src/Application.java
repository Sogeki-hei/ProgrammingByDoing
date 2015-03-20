// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();
    System.out.print("Give me the max value for the integers: ");
    System.out.print("\n> ");
    int counts = sc.nextInt();
    ArrayList<Integer> al = new ArrayList<Integer>();
    for ( int i = 0; i < 10; i++ ) {
      al.add(1 +rm.nextInt(counts));
    }
    System.out.println("ArrayList: " + al);
  }

}
