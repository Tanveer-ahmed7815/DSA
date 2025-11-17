package Strings;
/*
Remove Adjacent Duplicates (k times)

Problem:
Given a string s and an integer k, remove adjacent duplicates if a character repeats k times consecutively.

Example:
Input: "deeedbbcccbdaa", k = 3
Output: "aa"

Explanation:
eee removed → ddbbcccbdaa
ccc removed → ddbbbdaa
bbb removed → dddaa
ddd removed → aa
 */

import java.util.HashMap;
import java.util.Map;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "deeedbbcccbdaacc";
        //Output: "aa"
        int k = 3;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 3) {
                map.remove(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            for (int i = 0; i < value; i++) {
                sb.append(key);
            }
        }
        System.out.println(sb.toString());
    }
}


