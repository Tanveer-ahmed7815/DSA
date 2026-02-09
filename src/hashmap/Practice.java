package hashmap;

import java.util.HashMap;
import java.util.Map;

/*
Two Sum (Unsorted)

[3,2,4], target=6 → [1,2]
 */
public class Practice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println(i + ", " + map.get(target - arr[i]));
                break;
            }
            map.put(arr[i], i);
        }
    }
}
