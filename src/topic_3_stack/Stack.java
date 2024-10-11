package topic_3_stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackList;

    public Stack() {
        stackList = new ArrayList<>();
    }

    public void push(int value) {
        stackList.add(value);
        System.out.println(value + " pushed to the stack.");
    }

    public void pop() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int removedValue = stackList.remove(stackList.size() - 1);
            System.out.println(removedValue + " popped from the stack.");
        }
    }

    public int peek() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
}

