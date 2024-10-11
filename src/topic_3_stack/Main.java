package topic_3_stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: 1 - Push, 2 - Pop, 3 - Peek, 4 - Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a value to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Top of the stack: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
