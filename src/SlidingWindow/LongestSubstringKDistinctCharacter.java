package SlidingWindow;
/*
Longest Substring with K Distinct Characters

Problem:
Return the length of the longest substring with at most k distinct characters.

Example:
Input: s = "eceba", k = 2
Output: 3
Explanation: "ece"
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctCharacter {
    public static void main(String[] args) {
        String s = "ecba";
        int k = 2;

        int l = 0;
        int r = 0;

        Map<Character, Integer> map = new HashMap<>();
        int maxSize = 0;

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if (map.size() <= k) {
                maxSize = Math.max(maxSize, r - l + 1);
            } else {
                if (map.get(s.charAt(l)) == 1) {
                    map.remove(s.charAt(l));
                } else {
                    map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                }
                l++;
            }
            r++;
        }

        System.out.println(maxSize);
    }
}
