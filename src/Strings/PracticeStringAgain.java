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

        String[] str = {"a", "a", "b", "b", "b"};
        Map<String, Integer> map = new HashMap<>();

        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
            list.add(String.valueOf(entry.getValue()));
        }

      //  System.out.println(list);

        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        System.out.println(Arrays.toString(res));

    }

}
