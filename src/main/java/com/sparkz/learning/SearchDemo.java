/**
 * This class provides different variations of the linear and search methods with some for calculating 
 * the steps followed in the iteration of those methods
 */
package com.sparkz.learning;

public class SearchDemo {

	/**
	 * Searches an array of int for a target and returns the index
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @return the index of the target in the array or -1 if not
	 *         found
	 */
	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				return i;
		return -1;
	}

	/**
	 * Searches an array of int for a target and returns the steps taken to get the
	 * target
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @return the steps taken to find the target in the array
	 */
	public static int linearSearchSteps(int[] nums, int target) {
		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			steps++;
			if (nums[i] == target) {
				return steps;
			}
		}
		return steps;
	}

	/**
	 * Searches an array of int for a target and returns the index
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @return the index of the target in the array or -1 if not
	 *         found
	 */
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (nums[mid] == target)
				return mid;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	/**
	 * Searches an array of int for a target and returns the index using the binary
	 * search algorithm recursively. The left and right params are specified as
	 * argument
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @param left   - the starting point for iteration
	 * @param right  - the ending point for iteration
	 * @return the index of the target in the array or -1 if not
	 *         found
	 */
	public static int binarySearch(int[] nums, int target, int left, int right) {

		while (left <= right) {
			int mid = (left + right) / 2;

			if (nums[mid] == target)
				return mid;
			if (nums[mid] < target)
				return binarySearch(nums, target, mid + 1, right);
			else
				return binarySearch(nums, target, left, mid - 1);
		}
		return -1;
	}

	/**
	 * Searches an array of int for a target using the binary search algorithm and
	 * returns the steps taken to get the target
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @return the steps taken to find the target in the array
	 */
	public static int binarySearchSteps(int[] nums, int target) {
		int steps = 0;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (nums[mid] == target)
				return steps;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return steps;
	}

	/**
	 * Searches an array of int for a target using the binary search algorithm
	 * recursively
	 * and returns the steps taken to get the target
	 * 
	 * @param nums   - int array
	 * @param target - the value to be found
	 * @return the steps taken to find the target in the array
	 */
	public static int binarySearchSteps(int[] nums, int target, int left, int right, int steps) {

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (nums[mid] == target)
				return steps;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return steps;
	}
}