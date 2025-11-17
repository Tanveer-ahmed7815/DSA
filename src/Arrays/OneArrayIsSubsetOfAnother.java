package Arrays;
/*
Check if One Array is a Subset of Another

Problem:
Given arrays A and B, return true if every element of B exists in A.

Example 1:

Input: A = [1, 2, 3, 4, 5], B = [2, 5, 3]
Output: true

Example 2:

Input: A = [1, 2, 3, 4], B = [2, 6]
Output: false
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OneArrayIsSubsetOfAnother {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 5, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr1).forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));

        for (int i : arr2) {
            if (map.get(i) == null) {
                System.out.println(false);
                return;
            } else {
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }

        System.out.println(true);
    }
}
