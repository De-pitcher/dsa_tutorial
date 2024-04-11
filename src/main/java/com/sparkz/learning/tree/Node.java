package com.sparkz.learning.tree;

/**
 * Represents a node in a binary tree data structure.
 * Each node contains an integer value (data) and references to its left and right child nodes.
 */
public class Node {
    int data;       // The integer value stored in this node
    Node left;      // Reference to the left child node
    Node right;     // Reference to the right child node

    /**
     * Constructs a new Node with the specified integer value.
     * @param data The integer value to be stored in this node.
     */
    public Node(int data) {
        this.data = data;
    }
}
