package com.sparkz.learning.linked_list;

/**
 * This class represents a singly linked list data structure.
 * Each node in the linked list contains an integer value and a reference to the
 * next node.
 */
public class LinkedList {
    Node head; // Reference to the first node in the linked list

    /**
     * Displays the elements of the linked list.
     */
    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + " ");
        System.out.println();
    }

    /**
     * Converts the linked list into an array.
     * 
     * @return An array containing the elements of the linked list.
     */
    public int[] toArray() {
        int list[] = new int[size()];
        Node node = head;

        for (int i = 0; i < list.length; i++) {
            list[i] = node.data;
            node = node.next;
        }
        return list;
    }

    /**
     * Returns the number of elements in the linked list.
     * 
     * @return The size of the linked list.
     */
    public int size() {
        Node node = head;
        int length = 1;

        while (node.next != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    /**
     * Clears the linked list by setting the head reference to null.
     */
    public void clear() {
        head = null;
    }

    /**
     * Inserts a new node with the specified data at the end of the linked list.
     * 
     * @param data The data to be inserted.
     */
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next = node;
        }
    }

    /**
     * Inserts a new node with the specified data at the beginning of the linked
     * list.
     * 
     * @param data The data to be inserted.
     */
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    /**
     * Inserts a new node with the specified data at the specified index in the
     * linked list.
     * 
     * @param index The index at which the data should be inserted.
     * @param data  The data to be inserted.
     */
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0)
            insertAtStart(data);
        else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                System.out.println("Times: " + i);
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    /**
     * Deletes the node at the specified index from the linked list.
     * 
     * @param index The index of the node to be deleted.
     */
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node tmp = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            tmp = n.next;
            n.next = tmp.next;
            tmp = null;
        }
    }

}
