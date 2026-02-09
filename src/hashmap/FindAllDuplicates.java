package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find All Duplicates

[4,3,2,7,8,2,3,1] → [2,3]
 */
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        map.entrySet().forEach(e -> {
            if (e.getValue() > 1) {
                list.add(e.getKey());
            }
        });

        System.out.println(list);
    }
}
