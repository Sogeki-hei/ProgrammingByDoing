// Haruka Kasugano 17/03/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws Exception

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Which base ( 2 - 10 ) : ");
		int base = sc.nextInt();

		for (int thous = 0; thous < base; thous++) {
			for (int hund = 0; hund < base; hund++) {
				for (int tens = 0; tens < base; tens++) {
					for (int ones = 0; ones < base; ones++) {
						System.out.print(" " + thous + "" + hund + "" + tens
						        + "" + ones + "\r");
						Thread.sleep(10);
					}
				}
			}
		}

		System.out.println();
	}
}