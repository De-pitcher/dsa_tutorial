package com.sparkz.learning;

public class Queue {
    private static final int INITIAL_CAPACITY = 10;
    private int queue[];
    private int currentSize;
    private int front;
    private int rear;

    public Queue() {
        queue = new int[INITIAL_CAPACITY];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == queue.length;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int i = front;
        while (count < currentSize) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length; // circular increment
            count++;
        }
        System.out.println();
    }

    public int getSize() {
        return currentSize;
    }

    public int[] toArray() {
        int[] array = new int[currentSize];
        int index = 0;
        int i = front;
        while (index < currentSize) {
            array[index++] = queue[i];
            i = (i + 1) % queue.length; // circular increment
        }
        return array;
    }

    public void enqueue(int data) {
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        currentSize++;
    }

    private void resize() {
        int newCapacity = queue.length * 2;
        int[] newArray = new int[newCapacity];
        int i = 0;
        while (!isEmpty()) {
            newArray[i++] = dequeue();
        }
        front = 0;
        rear = currentSize - 1;
        queue = newArray;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        currentSize--;
        return data;
    }

    public void clear() {
        front = 0;
        rear = -1;
        currentSize = 0;
    }
}
