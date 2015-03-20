// Haruka Kasugano 11/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		int route = 1;
		
		System.out.println("SHIHAO'S TINY ADVENTURE!");
		
		while ( route != 0 ) {
			if ( route == 1 ) {
				System.out.println("\n You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\" ?");
				input = sc.nextLine();
				if ( input.equals("upstairs")) {
					route = 2;
				}
				if ( input.equals("kitchen")) {
					route = 3;
				}
			}
			if ( route == 2 ) {
				System.out.println("\n Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can go back \"downstairs\". Where would you like to go?");
				input = sc.nextLine();
				if ( input.equals("bedroom")) {
					route = 4;
				}
				if ( input.equals("bathroom")) {
					route = 5;
				}
				if ( input.equals("downstairs")) {
					route = 1;
				}
			}
			if ( route == 3 ) {
				System.out.println("\n There is a long countertop with dirty dishes everywhere.  Off to one sidethere is, as you'd expect, a refrigerator.  You may open the \"refrigerator\" or go \"back\".");
				input = sc.nextLine();
				if ( input.equals("refrigerator")) {
					route = 6;
				}
				if ( input.equals("back")) {
					route = 1;
				}
			}
			if ( route == 4 ) {
				System.out.println("\n There's a pile of porno magazines on the bed. Would you like to open it? ( \"yes\" or \"no\")");
				input = sc.nextLine();
				if ( input.equals("yes")) {
					System.out.println("Upon closer inspection, the seemingly shitty prostitude becomes ever so sexy to you. \n In the dim light, you put forward a tentative hand, \n a feeling of static sliding up your arm, \n You pass throught the portal into the unknown dimension...");
					route = 1;
				}
				if ( input.equals("no")) {
					System.out.println("You come out of the room...");
					route = 2;
				}
			}
			if ( route == 5 ) {
				System.out.println("\n To your surprise, there is a toilet bowl. Would you like to use it? ( \"yes\" or \"no\")");
				input = sc.nextLine();
				if ( input.equals("yes")) {
					System.out.println("Just when you are about to enjoy yourself, you feel a static up your back. \n Suddenly, you see a giant black hole infront  of you. \n You pass throught the portal into the unknown dimension...");
					route = 1;
				}
				if ( input.equals("no")) {
					System.out.println("You come out of the bathroom...");
					route = 2;
				}
			}
			if ( route == 6 ) {
				System.out.println("\n Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? ( \"yes\" or \"no\")");
				input = sc.nextLine();
				if ( input.equals("yes")) {
					System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach \n starts jumping like a frog in hot water.  You feel faint. Sliding to the \n floor, the darkness closes in.");
					route = 0;
				}
				if ( input.equals("no")) {
					System.out.println("You decide to come out of the kitchen...");
					route = 1;
				}
			}
		}
		System.out.println("You have died. GAME OVER.");
		
		
		
		
	}

}
