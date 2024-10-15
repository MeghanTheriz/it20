package topic_4_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int customerIdCounter = 1; // Counter to assign unique IDs to customers

        // Menu-driven program for queue operations
        do {
            System.out.println("\nQueue Management System:");
            System.out.println("1. Add customer to the queue (Enqueue)");
            System.out.println("2. Remove customer from the queue (Dequeue)");
            System.out.println("3. View next customer in the queue (Peek)");
            System.out.println("4. Display queue size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Enqueue operation
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    Customer customer = new Customer(customerIdCounter++, name);
                    customerQueue.enqueue(customer);
                    break;

                case 2:
                    // Dequeue operation
                    customerQueue.dequeue();
                    break;

                case 3:
                    // Peek operation
                    Customer nextCustomer = customerQueue.peek();
                    if (nextCustomer != null) {
                        System.out.println("Next customer in queue: " + nextCustomer);
                    }
                    break;

                case 4:
                    // Display queue size
                    System.out.println("Current queue size: " + customerQueue.size());
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Queue Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
