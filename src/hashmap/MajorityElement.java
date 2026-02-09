package hashmap;

import java.util.HashMap;
import java.util.Map;

/*
Majority Element
[2,2,1,1,2] → 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 1, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            if (map.get(a) > arr.length / 2) {
                System.out.println(a);
                break;
            }
        }

    }
}
