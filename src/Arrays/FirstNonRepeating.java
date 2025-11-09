package Arrays;

/*First Non-Repeating Element in an Array Problem:
Given an array of integers, return the first
element that occurs only once.
        Example: Input: arr = [4, 5, 1, 2, 0, 4]
Output: 5 Explanation: 4 repeats,
        5 is the first unique number.*/

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map);
        for (int j : arr) {
            if (map.get(j) == 1) {
                System.out.println(j);
                break;
            }
        }

    }
}
