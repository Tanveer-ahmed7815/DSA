package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
Input:
nums = [1,5,7,-1], k = 6
Output:
[(1,5), (7,-1)]
 */
public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int target = 6;
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            if(set.contains(target - i)){
                list.add(Arrays.asList(i, target - i));
            }else{
                set.add(i);
            }
        }

        System.out.println(list);

    }
}
