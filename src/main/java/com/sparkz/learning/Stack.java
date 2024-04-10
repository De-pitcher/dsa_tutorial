package com.sparkz.learning;

/**
 * Represents a stack data structure with fixed size.
 * The stack supports operations such as push, pop, peek, and clearAllData.
 */
public class Stack {
    public int size;
    private int stack[];
    private int top;

    /**
     * Constructs a stack with the specified size.
     * 
     * @param size The maximum capacity of the stack.
     */
    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = 0;
    }

    /**
     * Displays the elements of the stack.
     */
    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Converts the stack to an array.
     * 
     * @return An array representation of the stack.
     */
    public int[] toList() {
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
    }

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param data The element to be pushed onto the stack.
     */
    public void push(int data) {
        if (top == size) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return The element removed from the top of the stack.
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {

            top--;
            int data = stack[top];
            stack[top] = 0;
            return data;
        }
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return The element at the top of the stack.
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
