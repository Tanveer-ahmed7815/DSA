package Arrays;
/*
Reverse an Array

Problem:
Given an array nums, reverse it without using extra space.

Example:

Input: nums = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
