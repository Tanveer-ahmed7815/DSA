package SlidingWindow;
/*
Minimum Size Subarray Sum

Problem:
Return the minimum length of a contiguous subarray whose sum ≥ target.

Example:
Input: nums = [2,3,1,2,4,3], target = 7
Output: 2
 */

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLength = nums.length;
        int l = 0;
        int r = 0;

        int sum = 0;
        while (r < nums.length) {
            sum = sum + nums[r];
            while (sum >= target) {
                minLength = Math.min(minLength, r - l + 1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }

        System.out.println(minLength);
    }
}
