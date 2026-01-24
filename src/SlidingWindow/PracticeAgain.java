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

        //Input: s = "abcabcbb"
        //Output: 3
        //Explanation: "abc"

        String s = "abba";
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;

        while (r < s.length()) {

            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            } else {
                set.add(s.charAt(r));
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            }


        }

        System.out.println(maxLength);


    }

}
