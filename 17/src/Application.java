// Haruka Kasugano 5/3/2015
import java.util.Scanner;

public class Application {
	public static void main( String[] args) {
		double height, weight;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your height in m: ");
		height = keyboard.nextDouble();
		System.out.println("Your weight in kg: ");
		weight = keyboard.nextDouble();
		
		System.out.println("Your BMI is " + weight / (height * height));
	}

}
