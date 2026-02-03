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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeAgain {
    public static void main(String[] args) {

        //Longest Subarray with Sum ≤ K
        //
        //[1,2,3], k=3 → 2

        int[] nums = {2, 1, 5, 2, 3, 2};
        int k = 3;

        int l = 0;
        int r = 0;

        int maxSum = 0;
        int sum = 0;
        while (r < nums.length) {
            int len = r - l + 1;
            if (len > 3) {
                sum = sum - nums[l];
                l++;
            }
            sum = sum + nums[r];
            maxSum = Math.max(maxSum, sum);
            r++;
        }

        System.out.println(maxSum);

    }

}
