package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
int nums = [1,2,2,3,3,4,4,4,4,4,5,5,5]
find highest occurrence number in an array.
 */
public class MaxOccurence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int key = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(key);
    }
}
