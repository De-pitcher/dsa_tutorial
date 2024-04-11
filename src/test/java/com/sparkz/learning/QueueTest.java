package com.sparkz.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QueueTest {
    Queue queue;

    @BeforeAll
    void init() {
        queue = new Queue();
        System.out.println("Init()");
    }

    @Test
    void testEnQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int expected[] = { 1, 2, 3 };

        System.out.print("List after enqueue: ");
        queue.show();

        assertArrayEquals(expected, queue.toArray());
        queue.clear();
    }

    @Test
    void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        int expected[] = { 2, 3, 4, 5, };

        System.out.print("List before dequeue: ");
        queue.show();

        queue.dequeue();

        System.out.print("List after dequeue: ");
        queue.show();
        assertArrayEquals(expected, queue.toArray());
    }
}
