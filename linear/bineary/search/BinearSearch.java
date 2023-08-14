package com.linear.bineary.search;

public class BinearSearch {
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		int target = 1;
		int result = binarySearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index " + result);
		}
	}

}
