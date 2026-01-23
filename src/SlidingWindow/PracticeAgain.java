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

        //Minimum Size Subarray Sum
        //
        //[2,3,1,2,4,3], target=7 → 2

        int[] arr = {2, 3, 1, 2, 4, 7};
        int k = 7;

        int l = 0;
        int r = 0;
        int minLength = arr.length;
        int sum = 0;

        while (r < arr.length) {

            sum = sum + arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }
            if (sum == k) {
                minLength = Math.min(minLength, r - l + 1);
            }
            r++;

        }

        System.out.println(minLength);


    }

}
