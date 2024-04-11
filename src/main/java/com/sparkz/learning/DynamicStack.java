package com.sparkz.learning;

/**
 * Represents a dynamic stack data structure that automatically resizes itself
 * when needed.
 */
public class DynamicStack {
    /** The maximum capacity of the stack. */
    public int capacity;
    /** The internal array representing the stack elements. */
    private int stack[];
    /** The index of the top element in the stack. */
    private int top;

    /**
     * Constructs a new DynamicStack with an initial capacity of 2.
     */
    DynamicStack() {
        capacity = 2;
        stack = new int[capacity];
        top = 0;
    }

    /**
     * Displays the contents of the stack.
     */
    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Retrieves the stack elements as an array.
     * 
     * @return The array representation of the stack.
     */
    public int[] toArray() {
        return stack;
    }

    /**
     * Returns the current size of the stack.
     * 
     * @return The number of elements in the stack.
     */
    public int size() {
        return top;
    }

    /**
     * Clears all data from the stack.
     */
    public void clearAllData() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = 0;
        }
        top = 0;
        capacity = 2;
    }

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param data The data to be pushed onto the stack.
     */
    public void push(int data) {
        if (top == capacity) {
            System.out.println("Capacity: " + capacity);
            expand();
        }
        stack[top] = data;
        top++;

    }

    /**
     * Expands the capacity of the stack when it is full.
     */
    private void expand() {
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
        capacity *= 2;
    }

    /**
     * Removes and returns the top element from the stack.
     * 
     * @return The removed element from the top of the stack.
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            top--;
            int data = stack[top];
            stack[top] = 0;
            shrink();
            return data;
        }
    }

    /**
     * Shrinks the capacity of the stack when it is less than half full.
     */
    private void shrink() {
        if (size() <= (capacity / 2) / 2) {
            capacity /= 2;
            int newStack[] = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, size());
            stack = newStack;
        }
    }

    /**
     * Retrieves the top element of the stack without removing it.
     * 
     * @return The top element of the stack.
     */
    public int peek() {
        return stack[top - 1];
    }

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top <= 0;
    }
}
