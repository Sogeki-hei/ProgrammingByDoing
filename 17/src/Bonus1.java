// Haruka Kasugano 5/3/2015
import java.util.Scanner;

public class Bonus1 {
	public static void main(String[] args) {
		
		double inches, m, pounds, kg;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your height in inches: ");
		inches = keyboard.nextDouble();
		m = inches * 0.0254;
		System.out.println("Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		kg = pounds * 0.45359237;
		
		System.out.println("Your BMI is " + kg / (m * m));
	}

}
