package com.sparkz.learning.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    void testInsert() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);

        int expected[] = { 7, 8 };

        tree.inorder();

        assertArrayEquals(expected, tree.toArray());
    }
}
