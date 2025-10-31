package SlidingWindow;
/* Created by ayesh on 31-10-2025 */

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABAA";
        int k = 1;

        int r = 0, l = 0, maxLength = 0, maxRepeat = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            char currentChar = s.charAt(r);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            maxRepeat = Math.max(maxRepeat, map.get(currentChar));
            int windowLength = r - l + 1;
            int nonRepeat = windowLength - maxRepeat;


            if (nonRepeat > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            if (nonRepeat <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;

        }

        System.out.println(maxLength);
    }

}
