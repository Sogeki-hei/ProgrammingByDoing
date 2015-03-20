// Haruka Kasugano 16/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		int i = 10;

		System.out.println("What is your name: ");
		name = sc.next();

		if (name.equals("Shihao")) {
			i = 5;
		}
		for (int x = 1; x <= i; x++) {
			System.out.println(name);
		}
	}
}
