// Haruka Kasugano 16/03/2015
public class Application {
	public static void main(String[] args) {

		System.out.println("Month 1: " + month_name(1));
		System.out.println("Month 2: " + month_name(2));
		System.out.println("Month 3: " + month_name(3));
		System.out.println("Month 4: " + month_name(4));
		System.out.println("Month 5: " + month_name(5));
		System.out.println("Month 6: " + month_name(6));
		System.out.println("Month 7: " + month_name(7));
		System.out.println("Month 8: " + month_name(8));
		System.out.println("Month 9: " + month_name(9));
		System.out.println("Month 10: " + month_name(10));
		System.out.println("Month 11: " + month_name(11));
		System.out.println("Month 12: " + month_name(12));
		System.out.println("Month 43: " + month_name(43));
	}

	public static String month_name( int i ) {
		String month = null ;
		if (i == 1)
			month = "January";
		if (i == 2)
			month = "Febuary";
		if (i == 3)
			month = "March";
		if (i == 4)
			month = "April";
		if (i == 5)
			month = "May";
		if (i == 6)
			month = "June";
		if (i == 7)
			month = "July";
		if (i == 8)
			month = "August";
		if (i == 9)
			month = "September";
		if (i == 10)
			month = "October";
		if (i == 11)
			month = "November";
		if (i == 12)
			month = "December";
		if (i > 12)
			month = "error";
		i++;
		return month;
	}

}
