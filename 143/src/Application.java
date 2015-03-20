// Haruka Kasugano 18/03/2015
import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

        int x, y;

        do
        {
            String swap;
            System.out.println("EXCHANGE POKEMON\n");
            System.out.println("0. " + pokeParty[0]);
            for ( int i=1; i<pokeParty.length; i++ )
                System.out.println(i + ". " + pokeParty[i]);

            System.out.println("\nChoose a Pokemon (Or enter -1 to quit.)");
            System.out.print("=> ");
            x = keyboard.nextInt();
            if ( x == -1 ) {
              System.exit(0);
            }
            System.out.println("Choose a Pokemon to exchange with " + pokeParty[x] + ".");
            System.out.print("=> ");
            y = keyboard.nextInt();

            // add code here to swap the Pokemon in slot 0 with the Pokemon in slot x
            System.out.println("EXCHANGING " + pokeParty[x] + " with " + pokeParty[y] + ".");
            swap = pokeParty[y];
            pokeParty[y] = pokeParty[x];
            pokeParty[x] = swap;

        } while ( true );

    }



}
