package SlidingWindow;
/*
Max Consecutive Ones

[1,1,0,1,1,1] → 3
 */

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 1};
        int maxCount = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[r] == 1) {
                maxCount = Math.max(maxCount, r - l + 1);
            } else {
                l = r + 1;
            }
            r++;
        }

        System.out.println(maxCount);
    }
}
