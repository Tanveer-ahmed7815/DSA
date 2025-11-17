package Arrays;
/*
Remove Even Numbers from an Array

Problem:
Given nums, remove all even numbers and return a new array containing only odd numbers.
Input: nums = [1, 2, 3, 4, 5, 6]
Output: [1, 3, 5]
Explanation: Even numbers 2, 4, 6 are removed.
 */

import java.util.Arrays;

public class RemoveEvenNumbersFromArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                nums[k++] = nums[i];
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
        }

        System.out.println(Arrays.toString(res));

    }
}
