// Haruka Kasugano 7/3/2015
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		String first, second, last;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE SHIHAO's TINY ADVENTURE!");
		System.out.println("");
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		first = keyboard.nextLine();
		
		if ( first.equals("kitchen") ) {
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			second = keyboard.nextLine();
			
			if ( second.equals("refrigerator") ) {
				System.out.println("Inside the refrigerator you see food and stuff. It look pretty nasty. Would you like to eat some of the food? ( \"yes\" or \"no\") ");
				last = keyboard.nextLine();
				
				if ( last.equals("no") ) {
					System.out.println("You die of starvation... eventually.");
				}
				else {
					System.out.println("You die of food poisoning... eventually.");
				}
			}else {
				System.out.println(" Where you found a book inside the cabinet. It may worth alot. Would you like to sell it? ( \"yes\" or \"no\" )");
				last = keyboard.nextLine();
				
				if ( last.equals("yes") ) {
					System.out.println("You become rich and win...");
				}
				else {
					System.out.println("You die of hunger...");
				}
			}
		}
		else {
			System.out.println( "At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway.  Where would you like to go?");
			second = keyboard.nextLine();
			
			if ( second.equals("bedroom") ) {
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would youlike to open the door? ( \"yes\" or \"no\" )");
				last = keyboard.nextLine();
				
				if ( last.equals("no") ) {
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements.");
				}
				else {
					System.out.println("You found a painting. You sold it. You win life.");
				}
			}
			else {
				System.out.println("You found the bathroom. Would you like to take a piss? ( \"yes\" or \"no\") ");
				last = keyboard.nextLine();
				
				if ( last.equals("yes") ) {
					System.out.println("You realised that you are a girl so you commited suicide.");
				}
				else {
					System.out.println("You realised that it's because it's too short so you commited suicide.");
				}
			}
			
		}
	}

}
