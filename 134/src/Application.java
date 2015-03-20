// Haruka Kasugano 17/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		boolean num = false;
		int[] Array = new int[10];
		int largest = 0, pos = 0;
		System.out.print("Array: ");
		for (int i = 0; i < 10; i++) {
			Array[i] = 1 + rm.nextInt(100);
			System.out.print(Array[i] + " ");
		}
		for (int i = 1; i < 10; i++) {
			if (Array[i] > largest) {
				largest = Array[i];
				pos = i + 1;
			}
		}
		System.out.println("\r\rThe largest number is " + largest);
		System.out.println("It is in slot " + pos);
	}
}