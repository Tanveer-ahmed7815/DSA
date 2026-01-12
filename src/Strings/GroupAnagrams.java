package Strings;
/*
Group Anagrams

Problem: Group all anagrams in a list of words.
Example:
Input: ["eat","tea","tan","ate","nat","bat"]
Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> map = new HashMap<>();
        for (String words : list) {
            char[] c = words.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);
        }

        System.out.println(new ArrayList<>(map.values()));
        System.out.println(map);
    }
}
