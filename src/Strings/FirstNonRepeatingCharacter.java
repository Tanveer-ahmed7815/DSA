package Strings;

/*First Non-Repeating Character

Problem: Return the index of the first non-repeating character in a string. If none exists, return -1.
Example:
Input: "leetcode"
Output: 0 (char 'l')*/

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "leetlcode";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        char[] ch = s.toCharArray();
        for (Character c : ch) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }



    }

}
