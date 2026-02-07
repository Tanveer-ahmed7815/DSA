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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeAgain {
    public static void main(String[] args) {

        //Example:
        //Input: arr = [2,1,5,1,3], k = 7
        //Output: 4
        //Explanation: [2,1,1,3]

        String str = "eceeba";
        int k = 2;

        Map<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;

        int maxLength = 0;

        while (r < str.length()) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            if (map.size() > k) {
                map.remove(str.charAt(l));
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;

        }

        System.out.println(maxLength);

    }

}
