// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void main(String[] args) {
    Random rm = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      a1.add(1 + rm.nextInt(100));
    }
    ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
    a1.set(9, -7);
    System.out.println(a1);
    System.out.println(a2);
  }
}
