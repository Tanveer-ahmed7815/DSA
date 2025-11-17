package Arrays;
/*
Maximum Sum Subarray (Kadane’s Algorithm)

Problem:
Find the contiguous subarray (containing at least one number) with the maximum sum and return that sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: Subarray [4,-1,2,1] has sum 6.
 */

public class MaximumSumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);
    }

}
