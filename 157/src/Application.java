// Haruka Kasugano 18/03/2015
import java.util.*;
import java.io.*;

class Car {
  String make;
  String model;
  int year;
  String nbr;
}


public class Application {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    Car[] cars = new Car[5];
    System.out.print("From which file do you want to load this information? ");
    String file = sc.next();
    Scanner f = new Scanner(new BufferedReader(new FileReader(file)));
    System.out.println("Data loaded.");
    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car();
      cars[i].make = f.next();
      cars[i].model = f.next();
      cars[i].year = f.nextInt();
      cars[i].nbr = f.next();
    }
    f.close();
    sort(cars);

    for (int n = 0; n < cars.length; n++) {
      System.out.println("\nCar " + (n + 1));
      System.out.println("\tMake: " + cars[n].make);
      System.out.println("\tModel: " + cars[n].model);
      System.out.println("\tYear: " + cars[n].year);
      System.out.println("\tLicense: " + cars[n].nbr);
    }

  }

  public static void sort(Car[] cars) {
    Car car_temp;
    for (int i = 0; i < cars.length; i++) {
      for (int n = i + 1; n < cars.length; n++) {
        if (cars[i].year > cars[n].year) {
          car_temp = cars[i];
          cars[i] = cars[n];
          cars[n] = car_temp;
        }
      }
    }
  }

}
