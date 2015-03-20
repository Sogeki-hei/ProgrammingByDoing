// Haruka Kasugano 18/03/2015

public class Application {
  public static void main(String[] args) {
    int[] arr = {45, 87, 39, 32, 93, 86, 12, 44, 75, 50};
    int save;

    System.out.print("before: ");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();

    for (int i = 0; i < arr.length; i++) {
      for (int n = i + 1; n < arr.length; n++) {
        if (arr[n] < arr[i]) {
          save = arr[n];
          arr[n] = arr[i];
          arr[i] = save;
        }
      }
    }

    System.out.print("after : ");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
