// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void sort(ArrayList<Integer> x) {
    int temp;
    for (int i = 0; i < x.size(); i++) {
      for (int j = i + 1; j < x.size(); j++) {
        if (x.get(j) > x.get(i)) {
          temp = x.get(j);
          x.set(j, x.get(i));
          x.set(i, temp);
        }
      }
    }
  }

  public static void main(String[] args) {
    Random rm = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      a1.add(10 + rm.nextInt(90));
    }
    System.out.println("ArrayList before: " + a1);
    sort(a1);
    System.out.println("ArrayList after: " + a1);
  }
}
