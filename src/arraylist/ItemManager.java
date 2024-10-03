package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
    private ArrayList<String> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void manageItems() {
        boolean running = true;
        while (running) {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter item to add:");
                    String item = scanner.nextLine();
                    items.add(item);
                    System.out.println(item + " added.");
                    break;
                case 2:
                    System.out.println("Enter item to remove:");
                    String itemToRemove = scanner.nextLine();
                    if (items.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " removed.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    System.out.println("Items:");
                    for (String it : items) {
                        System.out.println(it);
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}