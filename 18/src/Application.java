// Haruka Kasugano 5/3/2015
public class Application {
	public static void main( String[] args) {
		int people = 30;
		int cats = 30;
		int dogs = 15;
		
		if ( people < cats ) { // Gives a condition and if it's fullfilled the action in the curly brackets will be triggered.
			System.out.println("Too many cats! The world is doomed!");
		}
		
		if ( people > cats ) {
			System.out.println("Not many cats! The world is saved!");
		}
		
		if ( people < dogs ) {
			System.out.println("The world is drooled on!");
		}
		
		if ( people > dogs ) {
			System.out.println("The world is dry!");
		}
		
		dogs += 5;
		if ( people >= dogs ) {
			System.out.println("People are greater than or equal to dogs.");
		}
		
		if ( people <= dogs ) {
			System.out.println("People are less than or equal to dogs.");
		}
		
		if ( people == dogs ) {
			System.out.println("People are dogs.");
		}
	}

}
