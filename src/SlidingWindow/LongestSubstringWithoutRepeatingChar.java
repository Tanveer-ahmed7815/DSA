package SlidingWindow;
/* Created by ayesh on 01-11-2025 */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "pwwkew";
        int l = 0, r = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

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
