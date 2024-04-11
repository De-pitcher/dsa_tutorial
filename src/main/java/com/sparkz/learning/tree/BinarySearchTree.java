package com.sparkz.learning.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root;

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

    public int[] toArray() {
        List<Integer> resultList = new ArrayList<>();
        inOrderTraversal(root, resultList);
        // Convert ArrayList to array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    private void inOrderTraversal(Node root, List<Integer> result) {
        if (root != null) {
            inOrderTraversal(root.left, result);
            result.add(root.data);
            inOrderTraversal(root.right, result);
        }
    }

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
