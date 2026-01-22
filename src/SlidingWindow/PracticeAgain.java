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

        //Output: [2.2, 2.8, 2.4, 3.6, 2.8]

        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        int l = 0;
        int r = 0;
        int sum = 0;
        List<Double> averageList = new ArrayList<>();
        while (r < arr.length) {
            int length = r - l + 1;
            if (length > k) {
                sum = sum - arr[l];
                l++;
            } else {
                sum = sum + arr[r];
                r++;
            }
            if (length == k) {
                double avg = (double) sum / k;
                averageList.add(avg);

            }
        }

        System.out.println(averageList);


    }

}
