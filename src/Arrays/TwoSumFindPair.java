package Arrays;
/*
Two Sum – Find Pair with Target Sum

Problem:
Given an integer array nums and a target T, return indices or values of two numbers such that they add to T.

Example:

Input: nums = [2, 7, 11, 15], T = 9
Output: [2, 7]
Explanation: 2 + 7 = 9.

 */

import java.util.Arrays;
import java.util.HashSet;

public class TwoSumFindPair {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();
        int[] res = null;
        for (int i : nums) {
            if (set.contains(target - i)) {
                res = new int[]{target - i, i};
            } else {
                set.add(i);
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
