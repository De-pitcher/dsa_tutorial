/**
 * Represents a simple queue implementation using an array.
 */
package com.sparkz.learning;

public class Queue {
    private static final int INITIAL_CAPACITY = 10;
    private int queue[];
    private int currentSize;
    private int front;
    private int rear;

    /**
     * Constructs an empty queue with an initial capacity of 10.
     */
    public Queue() {
        queue = new int[INITIAL_CAPACITY];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise.
     */

    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Checks if the queue is full.
     * 
     * @return true if the queue is full, false otherwise.
     */
    public boolean isFull() {
        return currentSize == queue.length;
    }

    /**
     * Displays the elements of the queue.
     * If the queue is empty, prints "Queue is empty."
     */
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

    /**
     * Gets the current size of the queue.
     * 
     * @return The number of elements in the queue.
     */
    public int getSize() {
        return currentSize;
    }

    /**
     * Converts the queue to an array.
     * 
     * @return An array containing the elements of the queue.
     */
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

    /**
     * Adds an element to the rear of the queue.
     * 
     * @param data The element to be added.
     */
    public void enqueue(int data) {
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        currentSize++;
    }

    /**
     * Resizes the array if it is full.
     */
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

    /**
     * Removes and returns the element at the front of the queue.
     * 
     * @return The element removed from the front of the queue.
     */
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

    /**
     * Clears the queue by resetting front, rear, and currentSize.
     */
    public void clear() {
        front = 0;
        rear = -1;
        currentSize = 0;
    }
}
