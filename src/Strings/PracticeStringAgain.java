package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Stream;

//Check Rotation of Another String
//
//Problem: Return true if s2 is a rotation of s1.
//Example:
//Input: "waterbottle", "erbottlewat"
//Output: true
public class PracticeStringAgain {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> map = new HashMap<>();

        for(String words : list){
            char[] c = words.toCharArray();
            Arrays.sort(c);

            String key = new String(c);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);

        }

        System.out.println(map);
    }

}
