package Strings;
/*
Check if Two Strings are Isomorphic

Problem: Each char in s can be mapped to exactly one char in t.
Example:
Input: "egg", "add"
Output: true
 */

import java.util.HashMap;
import java.util.Map;

public class CheckStringsAreIsomorphic {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "aa";

        if (str1.length() != str2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (map1.containsKey(c1) && (map1.get(c1) != c2)) {
                System.out.println("Not Isomorphic");
                return;
            }
            if (map2.containsKey(c2) && (map2.get(c2) != c1)) {
                System.out.println("Not Isomorphic");
                return;
            }
            map1.put(c1, c2);
            map2.put(c2, c1);
        }

        System.out.println("Isomorphic");
    }
}
