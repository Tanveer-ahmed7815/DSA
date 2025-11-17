package Arrays;
/*
Count Occurrences of a Specific Element

Problem:
Given nums and a number x, return how many times x appears.

Example:

Input: nums = [1, 2, 2, 3, 2], x = 2
Output: 3
Explanation: 2 appears three times.
 */

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfSpecificElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 2};
        int x = 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map.get(x));
    }
}
