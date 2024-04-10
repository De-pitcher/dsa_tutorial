package com.sparkz.learning;

public class Stack {
    public int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = 0;
    }

    private int stack[];
    private int top;

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
    }

    public void push(int data) {
        if (top == size) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

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

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
