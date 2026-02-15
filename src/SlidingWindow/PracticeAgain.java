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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeAgain {
    public static void main(String[] args) {

        //Longest Consecutive Sequence
        //[100,4,200,1,3,2] → 4
        int[] arr = {100, 4, 200, 1, 3, 2, 0};
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            count = 1;
            while (set.contains(num - count)) {
                count++;
                maxCount = Math.max(count, maxCount);
            }

        }
        System.out.println(maxCount);

    }

}
