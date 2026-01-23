package SlidingWindow;
/*
Longest Consecutive Sequence
[100,4,200,1,3,2] → 4
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Set<Integer> set = new HashSet<>();

        Arrays.stream(nums).forEach(set::add);

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int count = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        System.out.println(longest);
    }
}
