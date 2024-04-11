/**
 * Represents a binary search tree (BST) data structure.
 */
package com.sparkz.learning.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root;

    /**
     * Inserts a new node with the given data into the BST.
     * 
     * @param data The data to be inserted.
     */
    public void insert(int data) {
        root = insertRect(root, data);
    }

    private Node insertRect(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data > root.data)
            root.right = insertRect(root.right, data);
        else if (data < root.data)
            root.left = insertRect(root.left, data);

        return root;
    }

    /**
     * Converts the elements of the BST to an array in ascending order.
     * 
     * @return An array containing the elements of the BST in ascending order.
     */
    public int[] toArray() {
        List<Integer> resultList = new ArrayList<>();
        inorderTraversal(root, resultList);
        // Convert ArrayList to array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    private void inorderTraversal(Node root, List<Integer> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root.data);
            inorderTraversal(root.right, result);
        }
    }

    /**
     * Prints the elements of the BST in ascending order.
     */
    public void inorder() {
        System.out.print("Elements in the BST: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

}
