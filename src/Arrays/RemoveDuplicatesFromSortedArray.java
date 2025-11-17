package Arrays;
/*
Remove Duplicates From a Sorted Array

Problem:
Given a sorted array nums, remove duplicates in-place and return the new length.

Example:

Input: nums = [1, 1, 2, 2, 3]
Output: [1, 2, 3]
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        System.out.println(k);
    }
}
