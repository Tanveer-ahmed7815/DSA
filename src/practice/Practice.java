package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful";
        String[] s = input.trim().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String words : s){
            map.put(words, map.getOrDefault(words, 0) + 1);
        }

        System.out.println(map);
    }
}
