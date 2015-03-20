// Haruka Kasugano
import java.util.*;
import java.io.*;

class student {
  int id;
  int gn;
  double gd;
  String lett;
  public String toString() {
    return ( id + " " + gn + " " + gd + " " + lett);
  }
}


public class Application {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    student[] students = new student[30];
    student temp;
    System.out.print("Open which file: ");
    String file = sc.next();
    sc.close();

    Scanner f = new Scanner(new BufferedReader(new FileReader(file)));
    for (int i = 0; i < students.length; i++) {
      students[i] = new student();
      students[i].id = f.nextInt();
      students[i].gn = f.nextInt();
      students[i].gd = f.nextDouble();
      students[i].lett = f.next();
    }
    System.out.println("\nData loaded.");

    for (int i = 0; i < students.length; i++) {
      for (int n = i + 1; n < students.length; n++) {
        if (students[i].id > students[n].id) {
          temp = students[n];
          students[n] = students[i];
          students[i] = temp;
        }
      }
    }
    for (int i = 0; i < students.length; i++) {
      for (int n = i + 1; n < students.length; n++) {
        if (students[i].id == students[n].id && students[i].gn > students[n].gn) {
          temp = students[n];
          students[n] = students[i];
          students[i] = temp;
        }
      }
    }
    System.out.println("Data sorted.");
    System.out.println("\nHere are the sorted grades: ");
    for ( int j = 0; j < students.length; j++ ) {
      System.out.println("\t" + students[j]);
    }
  }

}
