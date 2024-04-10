package com.sparkz.learning;

/**
 * This class provides various sorting algorithms implementations such as bubble
 * sort,
 * selection sort, insertion sort, quick sort, and merge sort.
 */
public class SortingDemo {

    /**
     * Prints the contents of the array along with a message.
     * 
     * @param array The array to be printed.
     * @param msg   The message to be printed before the array.
     */
    public static void printArray(int[] array, String msg) {
        System.out.print(msg + ": ");
        for (var i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Sorts an array of integers using the bubble sort algorithm.
     * 
     * @param array The array to be sorted.
     */
    static void bubbleSort(int[] array) {
        int size = array.length;
        int tmp;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            SortingDemo.printArray(array, "Been sorted array");
        }
    }

    /**
     * Sorts an array of integers using the selection sort algorithm.
     * 
     * @param array The array to be sorted.
     */
    public static void selectionSort(int[] array) {
        int size = array.length;
        int tmp;
        int minIndex = -1;

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j])
                    minIndex = j;
            }
            tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
            SortingDemo.printArray(array, "Been sorted array");
        }
    }

    /**
     * Sorts an array of integers using the insertion sort algorithm.
     * 
     * @param array The array to be sorted.
     */
    public static void insertionSort(int[] array) {
        int size = array.length;
        int key = -1;
        int j = -1;

        for (int i = 1; i < size; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
            SortingDemo.printArray(array, "Been sorted array");
        }
    }

    /**
     * Sorts an array of integers using the quick sort algorithm.
     * 
     * @param array The array to be sorted.
     * @param low   The starting index of the array.
     * @param high  The ending index of the array.
     */
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    /**
     * Partitions the array for quick sort.
     * 
     * @param array The array to be partitioned.
     * @param low   The starting index of the partition.
     * @param high  The ending index of the partition.
     * @return The index of the pivot element.
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = tmp;
        return i + 1;
    }

    /**
     * Sorts an array of integers using the merge sort algorithm.
     * 
     * @param array The array to be sorted.
     * @param left  The left index of the array.
     * @param right The right index of the array.
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted array.
     * 
     * @param array The array to be merged.
     * @param left  The left index of the array.
     * @param mid   The middle index of the array.
     * @param right The right index of the array.
     */
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int i = 0, j = 0, k = left;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (var x = 0; x < n1; x++) {
            lArr[x] = array[left + x];
        }

        for (var x = 0; x < n2; x++) {
            rArr[x] = array[mid + 1 + x];
        }

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                array[k] = lArr[i];
                i++;
            } else {
                array[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rArr[j];
            j++;
            k++;
        }
    }
}
