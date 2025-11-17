package Arrays;
/*
Find Common Elements Between Two Arrays

Problem:
Return a new array containing elements that appear in both arrays.

Example:

Input: A = [1, 2, 3, 4], B = [2, 4, 6]
Output: [2, 4]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        List<Integer> list = new ArrayList<>();
        for (int i : b) {
            if (map.get(i) != null) {
                list.add(i);
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }

        System.out.println(list);
    }
}
