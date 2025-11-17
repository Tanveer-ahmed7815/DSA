package Arrays;
/*
Move All Zeros to End of Array

Problem:
Given nums, move all 0s to the end while maintaining order of non-zero elements.

Example:

Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
 */

import java.util.Arrays;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int k = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[k++] = i;
            }
        }

        while (k < nums.length) {
            nums[k++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
