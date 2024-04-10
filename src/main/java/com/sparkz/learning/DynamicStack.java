package com.sparkz.learning;

public class DynamicStack {
    public int capacity;
    private int stack[];
    private int top;

    DynamicStack() {
        capacity = 2;
        stack = new int[capacity];
        top = 0;
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] toList() {
        return stack;
    }

    public int size() {
        return top;
    }

    public void clearAllData() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = 0;
        }
        top = 0;
        capacity = 2;
    }

    public void push(int data) {
        if (top == capacity)
        {
            System.out.println("Capacity: " + capacity);
            expand();
        }
        stack[top] = data;
        top++;

    }

    private void expand() {
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
        capacity *= 2;
    }

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

    private void shrink() {
        if (size() <= (capacity / 2) / 2) {
            capacity /= 2;
            int newStack[] = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, size());
            stack = newStack;
        }
    }

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
