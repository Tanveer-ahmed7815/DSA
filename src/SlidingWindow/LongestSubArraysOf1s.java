package SlidingWindow;
/*
Longest Subarray of 1s After Replacing K Zeros

Problem:
You may replace at most k zeros with ones. Find the longest subarray of all 1s.

Example:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
 */

public class LongestSubArraysOf1s {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};
        int k = 2;

        int l = 0;
        int r = 0;

        int maxLength = 0;
        int count = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        System.out.println(maxLength);
    }
}
