package SlidingWindow;

/*
Input:
[-2,1,-3,4,-1,2,1,-5,4]
Output:
6 ([4,-1,2,1])
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = 0;
        int sum = 0;

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
