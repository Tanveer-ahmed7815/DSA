package Strings;
/*
Longest Substring Without Repeating Characters

Problem: Find the length of the longest substring without repeating characters.
Example:
Input: "abcabcbb"
Output: 3 (substring "abc")
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcdabcbb";

        int l = 0, r = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (r < input.length()) {

            if (!set.add(input.charAt(r))) {
                set.remove(input.charAt(l));
                l++;
            } else {
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            }

        }

        System.out.println(maxLength);
    }
}
