// Haruka Kasugano 16/03/2015
import java.util.Scanner;

public class Weekday {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
    System.out.println();
    System.out.println("All you have to do is enter your birth date, and it will");
    System.out.println("tell you the day of the week on which you were born.");
    System.out.println();
    System.out.println("Some automatic tests....");
    System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
    System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
    System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
    System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
    System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
    System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
    System.out.println();

    System.out.println("Now it's your turn!  What's your birthday?");
    System.out.print("Birth date (mm dd yyyy): ");
    int mm = keyboard.nextInt();
    int dd = keyboard.nextInt();
    int yyyy = keyboard.nextInt();

    // put a function call for weekday() here
    System.out.println("You were born on " + weekday(mm, dd, yyyy));
  }


  public static String weekday(int mm, int dd, int yyyy) {
    int yy, total;
    String date = "";

    yy = yyyy - 1900;
    total = (yy / 4) + yy + dd;
    total += month_offset(mm);
    if (is_leap(yy) == true && (mm == 1 || mm == 2)) {
      total -= 1;
    }
    total %= 7;

    date = weekday_name(total) + ", " + month_name(mm) + ", " + dd + ", " + yyyy;

    return date;
  }

  public static boolean is_leap(int yy) {
    boolean result;

    if (yy % 400 == 0)
      result = true;
    else if (yy % 100 == 0)
      result = false;
    else if (yy % 4 == 0)
      result = true;
    else
      result = false;

    return result;
  }

  public static int month_offset(int mm) {
    int result = 0;
    if (mm == 1)
      result = 1;
    if (mm == 2)
      result = 4;
    if (mm == 3)
      result = 4;
    if (mm == 4)
      result = 0;
    if (mm == 5)
      result = 2;
    if (mm == 6)
      result = 5;
    if (mm == 7)
      result = 0;
    if (mm == 8)
      result = 3;
    if (mm == 9)
      result = 6;
    if (mm == 10)
      result = 1;
    if (mm == 11)
      result = 4;
    if (mm == 12)
      result = 6;
    return result;
  }

  public static String weekday_name(int total) {
    String name = "";
    if (total == 2) {
      name = "Monday";
    }
    if (total == 3) {
      name = "Tuesday";
    }
    if (total == 4) {
      name = "Wednesday";
    }
    if (total == 5) {
      name = "Thursday";
    }
    if (total == 6) {
      name = "Friday";
    }
    if (total == 7 || total == 0) {
      name = "Saturday";
    }
    if (total == 1) {
      name = "Sunday";
    }
    return name;
  }

  public static String month_name(int mm) {
    String month = "";
    if (mm == 1)
      month = "January";
    if (mm == 2)
      month = "Febuary";
    if (mm == 3)
      month = "March";
    if (mm == 4)
      month = "April";
    if (mm == 5)
      month = "May";
    if (mm == 6)
      month = "June";
    if (mm == 7)
      month = "July";
    if (mm == 8)
      month = "August";
    if (mm == 9)
      month = "September";
    if (mm == 10)
      month = "October";
    if (mm == 11)
      month = "November";
    if (mm == 12)
      month = "December";
    return month;
  }

}
