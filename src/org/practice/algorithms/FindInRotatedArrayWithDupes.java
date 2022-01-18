package org.practice.algorithms;

public class FindInRotatedArrayWithDupes {

    public FindInRotatedArrayWithDupes() {

    }

    /**
     * Find if an element is present in a sorted and rotated array. Note that the array can have duplicates
     * For example, [5,6,6,7,8,9,0,0,1,2,3,3,3,4,5,5] with 5 returns true and 9 returns false
     */
    public boolean search(int[] nums, int target) {

       if (nums == null || nums.length == 0) return false;
       int start = 0;
       int end = nums.length - 1;
       while (start < end) {
           int mid = start + (end - start) / 2;
           if (nums[mid] == target) return true;
           // If left of mid is sorted then perform check and adjust start and end
           if (nums[start] < nums[mid]) {
               if (nums[start] <= target && target < nums[mid]) {
                   end = mid;
               } else {
                   start = mid + 1;
               }
           } else if (nums[start] > nums[mid]) { // If not left then if it is on the right
               // Note that this condition is required since there could be condition where mid point and left or right or both are equal
               if (nums[mid] < target && nums[start] > target) { // see the trick here is to compare with start only
                   start = mid + 1;
               } else {
                   end = mid;
               }
           } else { // This is required to handle when there are duplicates.
               start++;
           }
       }
       return false;
    }
}
