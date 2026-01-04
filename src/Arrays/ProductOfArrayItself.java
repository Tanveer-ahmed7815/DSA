package Arrays;
/*
Product of Array Except Self

Problem:
Return array where each element is product except itself.

Input:
nums = [1,2,3,4]
Output:
[24,12,8,6]
 */

import java.util.Arrays;

public class ProductOfArrayItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];

        prefix[0] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] * suffix[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
