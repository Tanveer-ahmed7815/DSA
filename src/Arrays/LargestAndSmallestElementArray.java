package Arrays;
/*
Find the Largest and Smallest Element in an Array

Problem:
Given an integer array nums, return the largest and smallest element.

Example:

Input: nums = [3, 5, 1, 8, 2]
Output: smallest = 1, largest = 8
Explanation: Minimum is 1 and maximum is 8.
 */

public class LargestAndSmallestElementArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 8, 2};
        int smallest = nums[0];
        int largest = nums[0];

        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }

        System.out.println("Minimum is " + smallest + " and Maximun is " + largest + ".");
    }
}
