package Arrays;
/*
Find Frequency of Each Element in an Array

Problem:
Given an array nums, return a map of each unique element and its frequency (occurrence count).

Example 1:

Input: nums = [1, 2, 2, 3, 1, 4, 2]
Output: {1=2, 2=3, 3=1, 4=1}
* */

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map);

    }
}
