// Haruka Kasugano 6/3/2015
public class Application {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			if (i % 10 == 0)
				System.out.print(" --------- \r");
			    System.out.print(" >-------- \r");
			if (i % 10 == 1)
				System.out.print(" ->------- \r");
			    System.out.print(" -->------ \r");
			if (i % 10 == 2)
				System.out.print(" --->----- \r");
			    System.out.print(" ---->---- \r");
			if (i % 10 == 3)
				System.out.print(" ----->--- \r");
			    System.out.print(" ------>-- \r");
			if (i % 10 == 4)
				System.out.print(" ------->- \r");
			    System.out.print(" --------> \r");
			if (i % 10 == 5)
				System.out.print(" --------- \r");
			    System.out.print(" --------< \r");
			if (i % 10 == 6)
				System.out.print(" -------<- \r");
			    System.out.print(" ------<-- \r");
			if (i % 10 == 7)
				System.out.print(" -----<--- \r");
			    System.out.print(" ----<---- \r");
			if (i % 20 == 8)
				System.out.print(" ---<----- \r");
			    System.out.print(" --<------ \r");
			if (i % 30 == 9)
				System.out.print(" -<------- \r");
			    System.out.print(" <-------- \r");

			Thread.sleep(200);
		}

	}
}
