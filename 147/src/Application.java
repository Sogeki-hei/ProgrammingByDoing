// Haruka Kasugano 18/03/2015
import java.util.Random;

public class Application {
  public static void exchange_sort(int[] a) {
    int minimal;
      for (int i = 0; i < a.length; i++) {
        minimal = i;
        for ( int j = i + 1; j < a.length; j++) {
          if ( a[j] < a[minimal]) {
            minimal = j;
          }
          swap(a, i, minimal);
        }
      }
  }

  public static void swap(int[] a, int i, int min) {
    int temp = a[i];
    a[i] = a[min];
    a[min] = temp;
  }


  public static void main(String[] args) {
    Random r = new Random();
    int[] arr = new int[10];
    int i;

    for (i = 0; i < arr.length; i++)
      arr[i] = 1 + r.nextInt(100);

    System.out.print("before: ");
    for (i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();

    exchange_sort(arr);

    System.out.print("after : ");
    for (i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
