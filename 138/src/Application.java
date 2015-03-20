// Haruka Kasugano 17/03/2015
import java.lang.reflect.Array;
import java.util.*;

public class Application {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();
    int x = rm.nextInt(5);
    Initialize(x);

  }

  public static void Initialize(int i) {
    String[] arr = {"thunder", "gay", "japan", "hello", "anal"};
    char[] word = arr[i].toCharArray();
    char[] show = empty(word.length);
    char[] wrong = new char[word.length];
    int counter = 0;
    int nbrwrong = 0;
    int win = 0;
    Display(word, show, wrong, counter, nbrwrong, win);

  }

  public static char[] empty(int length) {
    char[] newArr = new char[length];
    for (int i = 0; i < length; i++) {
      newArr[i] = '_';
    }
    return newArr;
  }

  public static void guess(char[] word, char[] empty, int counter, int nbrwrong, char[] wrong,
      int win) {
    Scanner sc = new Scanner(System.in);
    if (counter == word.length) {
      System.out.println("YOU WIN!");
      System.exit(0);
    }
    String guess = sc.next();
    char[] input = guess.toCharArray();
    boolean result = false;
    while (input.length > 1) {
      System.out.println("One alphabet only please...");
      guess = sc.next();
      input = guess.toCharArray();
    }
    for (int z = 0; z < word.length; z++) {
      if (input[0] == word[z]) {
        empty[z] = word[z];
        counter++;
        result = true;
      }

    }
    if (nbrwrong == word.length) {
      System.out.println("YOU LOSE!");
      System.exit(0);
    }
    if (result == false) {
      wrong[nbrwrong] = input[0];
      nbrwrong++;
    }
    Display(word, empty, wrong, counter, nbrwrong, win);
  }

  public static void Display(char[] word, char[] show, char[] wrong, int counter, int nbrwrong,
      int win) {
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.print("\nWord:	");
    for (int c = 0; c < show.length; c++) {
      String shown = (show[c] + " ");
      System.out.print(shown);
    }
    System.out.print("\r\rMisses: ");
    for (int y = 0; y < wrong.length; y++) {
      System.out.print(wrong[y] + " ");
    }
    System.out.println("\r\rGuess: ");
    guess(word, show, counter, nbrwrong, wrong, win);
  }
}
