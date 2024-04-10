package com.sparkz.learning.linked_list;

public class LinkedList {
    Node head;

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + " ");
        System.out.println();
    }

    public int[] toList() {
        int list[] = new int[size()];
        Node node = head;

        for (int i = 0; i < list.length; i++) {
            list[i] = node.data;
            node = node.next;
        }
        return list;
    }

    public int size() {
        Node node = head;
        int length = 1;

        while (node.next != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    public void clear() {
        head = null;
    }

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

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0)
            insertAtStart(data);
        else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                System.out.println("Times: "+ i);
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0)
        {
            head = head.next;
        }
        else {
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
