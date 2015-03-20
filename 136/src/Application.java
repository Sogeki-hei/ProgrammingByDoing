// Haruka Kasugano 17/03/2015
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrName = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] arrGrade = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] arrID = { 123456, 813225, 823669, 307760, 827131 };

		System.out.println("Values:\t");
		System.out.println("\t" + arrName[0] + " " + arrGrade[0] + " "
		        + arrID[0]);
		System.out.println("\t" + arrName[1] + " " + arrGrade[1] + " "
		        + arrID[1]);
		System.out.println("\t" + arrName[2] + " " + arrGrade[2] + " "
		        + arrID[2]);
		System.out.println("\t" + arrName[3] + " " + arrGrade[3] + " "
		        + arrID[3]);
		System.out.println("\t" + arrName[4] + " " + arrGrade[4] + " "
		        + arrID[4]);

		System.out.println("\rID number to find: ");
		int ID = sc.nextInt();
		sc.close();
		System.out.println("\r");
		for (int i = 0; i < arrID.length; i++) {
			if (ID == arrID[i]) {
				System.out.println("Found in slot " + (i + 1));
				System.out.println("\tName: " + arrName[i]);
				System.out.println("\tGrade: " + arrGrade[i]);
				System.out.println("\tID: " + arrID[i]);
			}
		}
	}

}
