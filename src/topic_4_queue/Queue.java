package topic_4_queue;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Customer> queue;

    // Constructor initializes the queue
    public Queue() {
        queue = new LinkedList<>();
    }

    // Enqueue method to add a customer to the queue
    public void enqueue(Customer customer) {
        queue.addLast(customer);
        System.out.println("Customer added to the queue: " + customer);
    }

    // Dequeue method to remove a customer from the front of the queue
    public Customer dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty. No customers to remove.");
            return null;
        }
        Customer removedCustomer = queue.removeFirst();
        System.out.println("Customer removed from the queue: " + removedCustomer);
        return removedCustomer;
    }

    // Peek method to view the next customer in the queue
    public Customer peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return null;
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the current size of the queue
    public int size() {
        return queue.size();
    }
}
