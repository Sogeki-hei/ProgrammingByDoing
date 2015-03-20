// Haruka Kasugano 4/3/2015
public class Application {
	public static void main( String[] args) {
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double myBlah;
		
		myName = "Haruka Kasugano";
		myAge = 14; 
		myHeight = 175; // cm
		myWeight = 50; // kg
		myEyes = "Black";
		myTeeth = "White";
		myHair = "Black";
		myBlah = 27.3;
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " cm tall.");
		System.out.println("He's " + myWeight + " kg heavy.");
		System.out.println("Actually, that's not too skinny.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
		
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
		
		System.out.println(Math.round(myBlah));
	}

}
