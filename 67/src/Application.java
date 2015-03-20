// Haruka Kasugano 14/03/2015
public class Application {
	public static void main(String[] args) {
		double add = 0.5;
		System.out.println("  x	y");
		System.out.println("-----------------");
		System.out.println("");
		
		for ( double i = -10; i <= 10; i += add) {
			System.out.println(i + "	" + i*i);
		}

	}
}
