package SlidingWindow;
/*
Longest Subarray with Sum ≤ K

Problem:
Given an array of positive integers, find the longest subarray whose sum is ≤ k.

Example:
Input: arr = [2,1,5,1,3], k = 7
Output: 4
Explanation: [1,5,1]
 */

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 1, 1};
        int k = 7;

        int maxLength = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            if (sum <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            } else {
                sum = sum - arr[l];
                l++;
            }
            r++;
        }

        System.out.println(maxLength);
    }
}
