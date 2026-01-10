package practice;
/* Created by ayesh on 10-01-2026 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> map = new HashMap<>();
        for(String words : list){
            char[] c = words.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);
        }

        System.out.println(new ArrayList<>(map.values()));
        System.out.println(map);

    }
}
