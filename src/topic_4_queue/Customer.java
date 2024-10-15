package topic_4_queue;

public class Customer {
    private String name;
    private int id;

    // Constructor
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Override toString to print Customer details
    @Override
    public String toString() {
        return "Customer [ID: " + id + ", Name: " + name + "]";
    }
}
