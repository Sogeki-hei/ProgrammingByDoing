// Haruka Kasugano 18/03/2015
import java.util.*;

class Student {
  String name;
  int grade;
  double average;
}

public class Application {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Student[] student = new Student[3];
    
    for ( int i = 0; i < student.length; i++ ) {
      student[i] = new Student();
      System.out.println("Enter student " + (i + 1) + "'s name: ");
      student[i].name = sc.next();
      System.out.println("Enter student " + (i + 1) + "'s grade: ");
      student[i].grade = sc.nextInt();
      System.out.println("Enter student " + (i + 1) + "'s average: ");
      student[i].average = sc.nextDouble();
      
    }
    System.out.print("\nThe names are: ");
    for ( int i = 0; i < student.length; i++ ) {
      System.out.print(student[i].name + "  ");
    }
    System.out.print("\nThe grades are: ");
    for ( int i = 0; i < student.length; i++ ) {
      System.out.print(student[i].grade + "  ");
    }
    System.out.print("\nThe averages are: ");
    for ( int i = 0; i < student.length; i++ ) {
      System.out.print(student[i].average + "  ");
    }
    System.exit(0);
    
    
    
    
    
  }

}
