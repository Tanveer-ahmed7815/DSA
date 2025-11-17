package Strings;
/*
Find Duplicate Characters in String

Problem: Return all characters that appear more than once.
Example:
Input: "programming"
Output: ['r','g','m']
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {

            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);

        }
        List<Character> dupCharList = map.entrySet().stream().filter(x -> x.getValue() > 1)
                .map(x -> x.getKey()).toList();

        System.out.println(dupCharList);

    }
}
