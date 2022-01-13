package org.practice.algorithms;

/**
 * Find the index of an element in a rotated sorted array with no duplicates
 * e.g., if the array is [5,6,7,0,1,2,3] and element to find is 1, then index is 4
 * If element is not found, -1 is returned
 */
public class FindInRotatedSortedArray {
    public FindInRotatedSortedArray() {

    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
