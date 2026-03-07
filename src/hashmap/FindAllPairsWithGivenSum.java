package hashmap;
/*
Problem:
Given an array and an integer k, find all pairs whose sum is equal to k.

Input:
nums = [1,5,7,-1], k = 6
Output:
[(1,5), (7,-1)]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllPairsWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1};
        int target = 6;
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i : nums){
            if(set.contains(target - i)){
                list.add(Arrays.asList(i, target - i));
            }else{
                set.add(i);
            }
        }
        System.out.println(list);
    }
}
