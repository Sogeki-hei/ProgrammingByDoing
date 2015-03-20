// Haruka Kasugano 19/03/2015
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class Car {
  String make;
  String model;
  int year;
  String license;

  public String toString() {
    return (year + " " + make + " " + model + " " + license);
  }
}


public class Application {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> cars = new ArrayList<Car>();
    Car[] indiv = new Car[5];
    System.out.print("From which file do you want to load this data? > ");
    String file_name = sc.next();
    Scanner f = new Scanner(new BufferedReader(new FileReader(file_name)));
    sc.close();
    for (int i = 0; i < indiv.length; i++) {
      indiv[i] = new Car();
      indiv[i].make = f.next();
      indiv[i].model = f.next();
      indiv[i].year = f.nextInt();
      indiv[i].license = f.next();
    }
    for (int i = 0; i < indiv.length; i++) {
      cars.add(indiv[i]);
    }
    System.out.println("DATA LOADED.");
    sort(cars);
    System.out.println("DATA SORTED.");
    System.out.println("\nArrayList: " + cars);

  }

  public static void sort(ArrayList<Car> x) {
    Car temp;
    for (int i = 0; i < x.size(); i++) {
      for (int j = i + 1; j < x.size(); j++) {
        if (x.get(j).year < (x.get(i).year)) {
          temp = x.get(j);
          x.set(j, x.get(i));
          x.set(i, temp);
        }
      }
    }
  }
}
