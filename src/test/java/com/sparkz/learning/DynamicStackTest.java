package com.sparkz.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DynamicStackTest {
    DynamicStack stack;

    @BeforeAll
    void init() {
        stack = new DynamicStack();
        System.out.println("Init()");
    }

    @Test
    void testPush() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expected[] = { 1, 2, 3, 0 };

        System.out.print("After push test: ");
        stack.show();

        assertArrayEquals(expected, stack.toList());
        stack.clearAllData();
    }

    @Test
    void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int expected[] = { 1, 2, 0, 0 };

        // afterAddition[] = { 1, 2, 3, 4, 5, 0, 0, 0 };
        System.out.print("After addition before pop: ");
        stack.show();

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.print("After pop test: ");
        stack.show();

        assertArrayEquals(expected, stack.toList());
        stack.clearAllData();
    }

    @Test
    void testPeek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int expected = 5;

        System.out.print("Stack list: ");
        stack.show();

        int data = stack.peek();
        System.out.println("Popped element: " + data);

        assertEquals(expected, data);
        stack.clearAllData();
    }

    @Test
    void testSize() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int expected = 5;

        System.out.print("Stack list: ");
        stack.show();

        int data = stack.size();

        assertEquals(expected, data);
        stack.clearAllData();
    }

    @Test
    void testIsEmpty() {
        stack.push(1);

        System.out.print("Stack list: ");
        stack.show();

        boolean data = stack.isEmpty();

        assertFalse(data);
        stack.clearAllData();
    }
}
