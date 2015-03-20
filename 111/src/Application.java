// Haruka Kasugano 17/03/2015

public class Application
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n = 1 ; n <= 3; n++ )
        {
            for ( char c ='A'; c <= 'E'; c++ ) // Control variable n is faster than c.
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.println( a + "-" + b + " " );
            }
            System.out.println();// * You will add a line of code here.
        }

        System.out.println("\n");

    }
}