package hashmap;
/*
Two Sum

Problem:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Input:
nums = [2,7,11,15], target = 9
Output:
[0,1]
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.out.println(i + "," + map.get(target - nums[i]));
            }
            map.put(nums[i], i);
        }

    }
}
