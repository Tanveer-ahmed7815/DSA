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

        //Longest Consecutive Sequence
        //
        //[100,4,200,1,3,2] → 4

        int[] nums = {100, 4, 200, 1, 3, 2, 6};
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int counter = 0;

        for (int i : nums) {
            int count = 0;
            int num = i;
            while (set.contains(num - 1)) {
                count++;
                num++;
            }
            counter = Math.max(count, counter);
        }

        System.out.println(counter);

    }

}
