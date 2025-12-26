package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Count and Say Sequence
//
//Problem: Return the nth term of the "count and say" sequence.
//        Example:
//Input: n = 4
//Output: "1211"
public class PracticeStringAgain {
    public static void main(String[] args) {

        String[] input = {"a", "a", "b", "b", "b", "c"};
        Map<String, Integer> map = new HashMap<>();

        for (String str : input) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
            list.add(entry.getValue().toString());
        }

        System.out.println(list);

    }

}
