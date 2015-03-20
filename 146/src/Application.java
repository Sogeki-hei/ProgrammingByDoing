// Haruka Kasugano 18/03/2015
import java.util.Random;

public class Application {
  public static void exchange_sort(int[] a) {
    boolean flag = true;
    while (flag) {
      flag = false;
      for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
          swap(a, i);
          flag = true;
        }
      }
    }
  }


  public static void swap(int[] a, int i) {
    int temp = a[i];
    a[i] = a[i + 1];
    a[i + 1] = temp;
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
