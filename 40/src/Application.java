// Haruka Kasugano 8/3/2015
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		
		int nb1, nb2, nb3, nb4, nb5, nb6, phrases;
		
		Random phrase = new Random();
		Random n1 = new Random();
		nb1 = 1 + n1.nextInt(54);
		Random n2 = new Random();
		nb2 = 1 + n2.nextInt(54);
		Random n3 = new Random();
		nb3 = 1 + n3.nextInt(54);
		Random n4 = new Random();
		nb4 = 1 + n4.nextInt(54);
		Random n5 = new Random();
		nb5 = 1 + n5.nextInt(54);
		Random n6 = new Random();
		nb6 = 1 + n6.nextInt(54);
		Random ph = new Random();
		phrases = 1 + ph.nextInt(6);
		
		if ( phrases == 1 )
			System.out.println("Fortune cookie says: \"Your blessing is no more than being safe and sound for the whole lifetime.\"");
		else if ( phrases == 2 )
			System.out.println("Fortune cookie says: \"Be mischievous and you will not be lonesome.\"");
		else if ( phrases == 3 )
			System.out.println("Fortune cookie says: \"Your artistic talents win the approval and applause of others.\"");
		else if ( phrases == 4 )
			System.out.println("Fortune cookie says: \"The one you love is closer than you think.\"");
		else if ( phrases == 5 )
			System.out.println("Fortune cookie says: \"One who admires you greatly is hidden before your eyes.\"");
		else if ( phrases == 6 )
			System.out.println("Fortune cookie says: \"There is yet time enough for you to take a different path.\"");
		else
			System.out.println("ERROR!");
		
		System.out.println(nb1 + " - " + nb2 + " - " + nb3 + " - " + nb4 + " - " + nb5 + " - " + nb6);
		
		
	}

}
