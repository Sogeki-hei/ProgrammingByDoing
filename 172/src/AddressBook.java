// Haruka Kasugano [Project Start: 19/03/2015]
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Group {
  String name;
  String address;
  String email;
  int number;

}


public class AddressBook {
  public static void main(String[] args) throws Exception {
    startup();
    menu(load());
  }

  public static void startup() throws IOException {
    Scanner sc1 = new Scanner(new BufferedInputStream(System.in));
    System.out.println("[AddressFolio™ ver0.1       ]");
    System.out.println("[Created by Haruka Kasugano ]");
    System.out.println("Press Enter to continue... ");
    sc1.nextLine();
  }

  public static final ArrayList<Group> load() throws IOException {
    Scanner sc2 = new Scanner(new BufferedInputStream(System.in));
    System.out.println("Please specify the file you want to load Data from:\n>  ");
    String file_name = sc2.next();
    if ( file_name.equals("new")) {
      ArrayList<Group> Book = new ArrayList<Group>();
      Group indiv = new Group();
      Book.add(indiv);
      menu(Book);
    }
    InputStream check = new BufferedInputStream(new FileInputStream(file_name));
    byte[] c = new byte[1024];
    int count = 0, readChars = 0;
    while ((readChars = check.read(c)) != -1) {
      for (int i = 0; i < readChars; i++) {
        if (c[i] == '\n') {
          count++;
        }
      }
    }
    check.close();
    ArrayList<Group> Book = new ArrayList<Group>();
    Group[] indiv = new Group[count - 1];
    Scanner f = new Scanner(new BufferedReader(new FileReader(file_name)));
    for (int i = 0; i < indiv.length; i++) {
      indiv[i] = new Group();
      indiv[i].name = f.nextLine();
      indiv[i].address = f.nextLine();
      indiv[i].email = f.nextLine();
      indiv[i].number = f.nextInt();
    }
    f.close();
    for (int i = 0; i < indiv.length; i++) {
      Book.add(indiv[i]);
    }
    System.out.println("DATA LOADED. PRESS ENTER TO CONTINUE...");
    sc2.nextLine();
    return Book;
  }

  public static void save(ArrayList<Group> al) throws IOException {
    Scanner sc3 = new Scanner(new BufferedInputStream(System.in));
    System.out.println("\nPlease specify the file you want to save Data to: ");
    System.out.print("\n> ");
    String file_name = sc3.next();
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file_name)));
    for ( int i = 1; i < al.size(); i++ ) {
    out.println(al.get(i).name);
    out.println(al.get(i).address);
    out.println(al.get(i).email);
    out.println(al.get(i).number);
    }
    out.close();
    System.out.println("DATA SAVED. PRESS ENTER TO CONTINUE...");
    sc3.nextLine();
    menu(al);
  }

  public static void menu(ArrayList<Group> al) throws IOException {
    Scanner user = new Scanner(System.in);
    boolean stop = false;
    int choice;
    while (stop == false) {
      System.out.println("1) Load from file");
      System.out.println("2) Save to file");
      System.out.println("3) Add an entry");
      System.out.println("4) Remove an entry");
      System.out.println("5) Edit an existing entry");
      System.out.println("6) Sort the address book");
      System.out.println("7) Search for a specific entry");
      System.out.println("8) Quit");
      System.out.print("\n\nPlease choose what you'd like to do with the database: ");
      choice = user.nextInt();

      if (choice == 1) {
        load();
      }
      if (choice == 2) {
        save(al);
      }
      if (choice == 3) {
        add_entry(al);
      }
      if (choice == 4) {
        remove_entry(al);
      }
      if (choice == 5) {
        edit_entry(al);
      }
      if (choice == 6) {
        sort(al);
      }
      if (choice == 7) {
        search(al);
      }
      if (choice == 8) {
        System.exit(0);
      }
    }
  }

  public static void add_entry(ArrayList<Group> al) throws IOException {
    Scanner sc3 = new Scanner(new BufferedInputStream(System.in));
    Group person = new Group();
    System.out.println("\nName: ");
    person.name = sc3.nextLine();
    System.out.println("\nAddress: ");
    person.address = sc3.nextLine();
    System.out.println("\nEmail: ");
    person.email = sc3.nextLine();
    System.out.println("\nNumber: ");
    person.number = sc3.nextInt();
    al.add(person);
    System.out.println("\nENTRY ADDED. PRESS ENTER TO CONTINUE...");
    sc3.nextLine();
    menu(al);
  }

  public static void remove_entry(ArrayList<Group> al) throws IOException {
    Scanner sc4 = new Scanner(new BufferedInputStream(System.in));
    boolean exist = false;
    ArrayList<Group> found = new ArrayList<Group>();
    System.out.println("\nName of the entry you want to delete: ");
    String find_entry = sc4.nextLine();
    System.out.println("LOCATING...");
    for (int i = 1; i <= al.size(); i++) {
      if (al.get(i).name.contains(find_entry)) {
        exist = true;
        found.add(al.get(i));
      }
    }
    if (exist == true) {
      System.out.println("Which one do you want to delete? ");
      for (int i = 1; i <= found.size(); i++) {
        System.out.println((i + 1) + ") ");
        System.out.println(found.get(i));
      }
      int choice = sc4.nextInt();
      al.remove(choice);
      System.out.println("\nENTRY REMOVED. PRESS ENTER TO CONTINUE...");
      sc4.nextLine();
      sc4.close();
      menu(al);
    } else {
      System.out.println("This name does not exist in the entries. PRESS ENTER TO COTINUE...");
      sc4.nextLine();
      sc4.close();
      menu(al);
    }
  }

  public static void edit_entry(ArrayList<Group> al) throws IOException {
    Scanner sc5 = new Scanner(new BufferedInputStream(System.in));
    boolean exist = false;
    ArrayList<Group> found = new ArrayList<Group>();
    ArrayList<Integer> index = new ArrayList<Integer>();
    System.out.println("\nName of the entry you want to delete: ");
    String find_entry = sc5.nextLine();
    System.out.println("LOCATING...");
    for (int i = 1; i < al.size(); i++) {
      if (al.get(i).name.contains(find_entry)) {
        exist = true;
        found.add(al.get(i));
        index.add(i);
      }
    }
    if (exist == true) {
      System.out.println("Which one do you want to edit? ");
      for (int i = 1; i < found.size(); i++) {
        System.out.println((i + 1) + ") ");
        System.out.println(found.get(i));
      }
      int choice = sc5.nextInt();
      System.out.println("\nName: ");
      al.get(index.get(choice - 1)).name = sc5.nextLine();
      System.out.println("\nAddress: ");
      al.get(index.get(choice - 1)).address = sc5.nextLine();
      System.out.println("\nEmail: ");
      al.get(index.get(choice - 1)).email = sc5.nextLine();
      System.out.println("\nNumber: ");
      al.get(index.get(choice - 1)).number = sc5.nextInt();
      System.out.println("\nENTRY EDITED. PRESS ENTER TO CONTINUE...");
      sc5.nextLine();
      sc5.close();
      menu(al);
    } else {
      System.out.println("This name does not exist in the entries. PRESS ENTER TO COTINUE...");
      sc5.nextLine();
      sc5.close();
      menu(al);
    }
  }

  public static void sort(ArrayList<Group> al) throws IOException {
    Scanner sc6 = new Scanner(System.in);
    Group temp;
    System.out.println("How do you want the AddressFolio to be sorted? ");
    System.out.println("1) Names");
    System.out.println("2) Addresses");
    System.out.println("3) Emails");
    System.out.println("4) Numbers\n> ");
    int choice = sc6.nextInt();

    if (choice == 1) {
      for (int i = 1; i < al.size(); i++) {
        for (int j = i + 1; j < al.size(); j++) {
          if (al.get(j).name.compareTo(al.get(i).name) < 0) {
            temp = al.get(j);
            al.set(j, al.get(i));
            al.set(i, temp);
          }
        }
      }
    }
    if (choice == 2) {
      for (int i = 1; i < al.size(); i++) {
        for (int j = i + 1; j < al.size(); j++) {
          if (al.get(j).address.compareTo(al.get(i).address) < 0) {
            temp = al.get(j);
            al.set(j, al.get(i));
            al.set(i, temp);
          }
        }


      }
    }
    if (choice == 3) {
      for (int i = 1; i < al.size(); i++) {
        for (int j = i + 1; j < al.size(); j++) {
          if (al.get(j).email.compareTo(al.get(i).email) < 0) {
            temp = al.get(j);
            al.set(j, al.get(i));
            al.set(i, temp);
          }
        }
      }
    }
    if (choice == 4) {
      for (int i = 1; i < al.size(); i++) {
        for (int j = i + 1; j < al.size(); j++) {
          if (al.get(j).number < al.get(i).number) {
            temp = al.get(j);
            al.set(j, al.get(i));
            al.set(i, temp);
          }
        }
      }
    }
    System.out.println("ENTRIES SORTED. PRESS ENTER TO CONTINUE...");
    sc6.nextLine();
    sc6.close();
    menu(al);
  }

  public static void search(ArrayList<Group> al) throws IOException {
    Scanner sc7 = new Scanner(System.in);
    boolean exist = false;
    ArrayList<Group> found = new ArrayList<Group>();
    System.out.println("\nName of the entry you want to search for: ");
    String find_entry = sc7.nextLine();
    System.out.println("LOCATING...");
    for (int i = 1; i < al.size(); i++) {
      if (al.get(i).name.contains(find_entry)) {
        exist = true;
        found.add(al.get(i));
      }
    }
    if (exist == true) {
      System.out.println("These are the entries found. ");
      for (int i = 1; i < found.size(); i++) {
        System.out.println((i + 1) + ") ");
        System.out.println(found.get(i));
        System.out.println("PRESS ENTER TO CONTINUE...");
        sc7.nextLine();
        sc7.close();
        menu(al);
      }
    }
    else {
      System.out.println("This name does not exist in the entries. PRESS ENTER TO COTINUE...");
      sc7.nextLine();
      sc7.close();
      menu(al);
    }
  }
}