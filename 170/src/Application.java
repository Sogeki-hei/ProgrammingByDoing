// Haruka Kasugano 19/03/2015
import java.util.*;

public class Application {
  public static void sort(ArrayList<String> x) {
    String temp;
    for (int i = 0; i < x.size(); i++) {
      for (int j = i + 1; j < x.size(); j++) {
        if (x.get(j).compareToIgnoreCase(x.get(i)) < 1) {
          temp = x.get(j);
          x.set(j, x.get(i));
          x.set(i, temp);
        }
      }
    }
  }

  public static void main(String[] args) {
    Random rm = new Random();
    Scanner sc = new Scanner(System.in);
    String[] initial;
    System.out.print("Sentence: ");
    String strings = sc.nextLine();
    initial = strings.split(" ");
    ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(initial));
    sort(a1);
    System.out.println(a1);
  }
}
