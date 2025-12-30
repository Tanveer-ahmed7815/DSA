package SlidingWindow;
/*
Maximum Sum Subarray of Size K

Problem:
Given an array of integers and an integer k, find the maximum sum of any contiguous subarray of size k.

Example:
Input: arr = [2, 1, 5, 1, 3, 2], k = 3
Output: 9
Explanation: Subarray [5,1,3] has the maximum sum.
 */

public class MaxSubArrayOfSizek {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 4, 2};
        int k = 3;

        k = k % arr.length;

        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum = maxSum + arr[i];
        }

        int totalSum = maxSum;

        int l = 0;
        int r = k - 1;

        while (r < arr.length - 1) {
            int sum = totalSum - arr[l];
            l++;
            r++;
            totalSum = sum + arr[r];
            maxSum = Math.max(maxSum, totalSum);
        }

        System.out.println(maxSum);
    }
}
