package Arrays;
/*
Find Index of an Element (Linear Search)

Problem:
Given nums and element x, return the index of the first occurrence.
If not found, return -1.

Example:

Input: nums = [5, 3, 7, 1], x = 7
Output: 2
 */

public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 1};
        int target = 7;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
