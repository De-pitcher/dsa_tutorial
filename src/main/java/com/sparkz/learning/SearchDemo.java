package com.sparkz.learning;

public class SearchDemo {
	
	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				return i;
		return -1;
	}

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