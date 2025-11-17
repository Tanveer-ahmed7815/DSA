package Arrays;
/*
Find the Second Largest Element in an Array

Problem:
Return the second largest unique number.
If it does not exist, return -1.

Example:

Input: nums = [10, 5, 20, 8]
Output: 10
Explanation: Largest = 20, second largest = 10.
 */

import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5, 5};
        Arrays.sort(nums);
        int k = 0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }


        if(k < 2){
            System.out.println(-1);
        }else{
            System.out.println(nums[k-2]);
        }
    }
}
