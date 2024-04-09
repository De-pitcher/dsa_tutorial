package com.sparkz.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchDemoTest {

	@Test
	void testLinearSearch() {
		int nums[] = { 5, 7, 9, 11, 13 };
		int target = 11;

		int result = SearchDemo.linearSearch(nums, target);
		int expected = 3;

		assertEquals(expected, result, () -> "Element not found at: " + expected);
	}

	@Test
	void testBinarySearch() {
		int nums[] = { 5, 7, 9, 11, 13 };
		int target = 11;

		int result = SearchDemo.binarySearch(nums, target);
		int expected = 3;

		assertEquals(result, expected, () -> "Element not found at: " + expected);
	}

	@Test
	void testBinarySearchTarget() {
		int nums[] = new int[1000];
		int target = 700;

		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;

		int result = SearchDemo.binarySearch(nums, target, nums.length / 2, nums.length - 1);
		int expected = 699;

		assertEquals(expected, result, () -> "Element not found at: " + expected);
	}

	@Test
	void testLinearSearchSteps() {
		int nums[] = new int[1000];
		int target = 500;

		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;

		int result = SearchDemo.linearSearchSteps(nums, target);
		int expected = 500;

		System.out.println("Steps ran: " + result);

		assertEquals(expected, result, () -> "Element not found at: " + expected);
	}

	@Test
	void testBinarySearchSteps() {
		int nums[] = new int[1000];
		int target = 700;

		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;

		int result = SearchDemo.binarySearchSteps(nums, target);
		int expected = 9;

		System.out.println("Steps ran: " + result);

		assertEquals(expected, result,	 () -> "Element not found at: " + expected);
	}

	@Test
	void testBinarySearchStepsTarget() {
		int nums[] = new int[1000];
		int target = 700;

		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;

		int result = SearchDemo.binarySearchSteps(nums, target, 0, nums.length - 1, 0);
		int expected = 9;

		System.out.println("Steps ran: " + result);

		assertEquals(expected, result, () -> "Element not found at: " + expected);
	}

}