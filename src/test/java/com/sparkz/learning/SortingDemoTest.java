package com.sparkz.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortingDemoTest {
    @Test
    void testBubbleSort() {
        int array[] = { 6, 5, 2, 8, 9, 4 };

        int sortedArray[] = { 2, 4, 5, 6, 8, 9 };

        System.out.println("-------------Bubble sort----------------");

        SortingDemo.printArray(array, "Initial array");

        SortingDemo.bubbleSort(array);

        SortingDemo.printArray(array, "Sorted array");

        assertArrayEquals(sortedArray, array);
    }

    @Test
    void testSelectionSort() {
        int array[] = { 6, 5, 2, 8, 9, 4 };

        int sortedArray[] = { 2, 4, 5, 6, 8, 9 };

        System.out.println("-------------Selection sort----------------");

        SortingDemo.printArray(array, "Initial array");

        SortingDemo.selectionSort(array);

        SortingDemo.printArray(array, "Sorted array");

        assertArrayEquals(sortedArray, array);
    }

    @Test
    void testInsertionSort() {
        int array[] = { 6, 5, 2, 8, 9, 4 };

        int sortedArray[] = { 2, 4, 5, 6, 8, 9 };

        System.out.println("-------------Insertion sort----------------");


        SortingDemo.printArray(array, "Initial array");

        SortingDemo.insertionSort(array);

        SortingDemo.printArray(array, "Sorted array");

        assertArrayEquals(sortedArray, array);
    }

    @Test
    void testQuickSort() {
        int array[] = { 6, 5, 2, 8, 9, 4 };

        int sortedArray[] = { 2, 4, 5, 6, 8, 9 };

        System.out.println("-------------Quick sort----------------");

        SortingDemo.printArray(array, "Initial array");

        SortingDemo.quickSort(array, 0, array.length - 1);

        SortingDemo.printArray(array, "Sorted array");

        assertArrayEquals(sortedArray, array);
    }

    @Test
    void testMergeSort() {
        int array[] = { 6, 5, 2, 8, 9, 4 };

        int sortedArray[] = { 2, 4, 5, 6, 8, 9 };

        System.out.println("-------------Merge sort----------------");

        SortingDemo.printArray(array, "Initial array");

        SortingDemo.mergeSort(array, 0, array.length - 1);

        SortingDemo.printArray(array, "Sorted array");

        assertArrayEquals(sortedArray, array);
    }

}
