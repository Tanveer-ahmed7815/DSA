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

        //Max Consecutive Ones
        //[1,1,0,1,1,1] → 3
        int[] arr = {1, 1, 1, 1, 1, 1, 0, 0};

        int l = 0;
        int r = 0;
        int maxCount = 0;
        while (r < arr.length) {
            if (arr[r] != 1) {
                l = r + 1;
            }
            maxCount = Math.max(maxCount, r - l + 1);
            r++;
        }

        System.out.println(maxCount);
    }

}
