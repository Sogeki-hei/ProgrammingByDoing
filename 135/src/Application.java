// Haruka Kasugano 17/03/2015

public class Application
{
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "Hello", "World"};
		int[] arr2 = { 1, 2, 3, 4, 5 };

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
		System.out.print("The second array is filled with the following values:\n\t");
		for ( int i=0; i<arr2.length; i++ )
			System.out.print( arr2[i] + " " );
		System.out.println();

	}
}
