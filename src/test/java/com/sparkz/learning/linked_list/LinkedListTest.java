package com.sparkz.learning.linked_list;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    static LinkedList list;

    @BeforeAll
    static void init() {
        list = new LinkedList();
    }

    @Test
    void testInsert() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        int expected[] = { 1, 2, 3, 4 };
        System.out.print("After insert: ");
        list.show();

        assertArrayEquals(expected, list.toList());
        list.clear();
        System.out.println();
    }

    @Test
    void testInsertAtStart() {
        list.insert(2);
        list.insert(3);
        list.insert(4);
        System.out.print("Before insertAtStart: ");
        list.show();
        list.insertAtStart(1);
        int expected[] = { 1, 2, 3, 4 };
        System.out.print("After insertAtStart: ");
        list.show();

        assertArrayEquals(expected, list.toList());
        list.clear();
        System.out.println();
    }

    @Test
    void testInsertAt() {
        list.insert(1);
        list.insert(3);
        list.insert(4);
        System.out.print("Before insertAt: ");
        list.show();
        list.insertAt(1,2);
        int expected[] = { 1, 2, 3, 4 };
        System.out.print("After insertAt: ");
        list.show();

        assertArrayEquals(expected, list.toList());
        list.clear();
        System.out.println();
    }

    @Test
    void testDeleteAt() {
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        System.out.print("Before deleteAt: ");
        list.show();
        int expected[] = { 1, 2, 3, 4 };
        list.deleteAt(2);
        System.out.print("After deleteAt: ");
        list.show();

        assertArrayEquals(expected, list.toList());
        list.clear();
    }
}
