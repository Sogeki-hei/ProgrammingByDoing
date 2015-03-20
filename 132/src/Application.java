// Haruka Kasugano 17/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		boolean num = false;
		int[] Array = new int[10];
		System.out.print("Array: ");
		for (int i = 0; i < 10; i++) {
			Array[i] = 1 + rm.nextInt(50);
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		System.out.println("\rValue to find: ");
		int value = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			if (Array[i] == value) {
				System.out.println(value + " is in slot " + i + ".");
				num = true;
			}
		}
		if (num == false) {
			System.out.println(value + " is not in the array.");
		}

	}

}
