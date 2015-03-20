// Haruka Kasugano 19/03/2015
import java.util.ArrayList;

public class Application {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    for ( int i = 0; i < 10; i++ ) {
      al.add(-113);
    }
    for ( int i = 0; i < al.size(); i++ ) {
      System.out.println("Slot " + (i+1) + " contains a " + al.get(i));
    }
  }

}
