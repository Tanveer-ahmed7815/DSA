package SlidingWindow;
/* Created by ayesh on 01-11-2025 */

public class MinSizeSubArraySum {
    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int l = 0, r = 0, minLength = Integer.MAX_VALUE, sum = 0;

        while (r < nums.length) {
            sum = sum + nums[r];
            while (sum >= target) {
                minLength = Math.min(minLength, r - l + 1);
                sum = sum - nums[l];
                l++;
            }
            r++;

        }

        minLength = minLength != Integer.MAX_VALUE ? minLength : 0;
        System.out.println(minLength);
    }
}
