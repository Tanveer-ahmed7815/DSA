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

        //Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        //Output: [3,3,5,5,6,7]

        int[] arr = {1, 3, -1, -3, -5, 3, 6, 7};
        int k = 3;

        int l = 0;
        int r = 0;
        int max = 0;
        List<Integer> averageList = new ArrayList<>();
        while (r < arr.length) {
            if (arr[r] > max) {
                max = arr[r];
            }
            int len = r - l + 1;
            if (len < k) {
                r++;
            } else if (len == k) {
                averageList.add(max);
            } else {
                l++;
            }

        }

        System.out.println(averageList);


    }

}
