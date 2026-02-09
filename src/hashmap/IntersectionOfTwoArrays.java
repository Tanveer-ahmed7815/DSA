package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Intersection of Two Arrays

[1,2,2,1], [2,2] → [2]
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Set<Integer> set = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1){
            map.put(i,1);
        }

        for (int i : nums2){
            if(map.containsKey(i)){
                set.add(i);
                map.remove(i);
            }
        }

        int[] array = set.stream().mapToInt(e -> e).toArray();
        System.out.println(Arrays.toString(array));

    }
}
