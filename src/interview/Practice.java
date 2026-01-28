package interview;
/* Created by ayesh on 26-01-2026 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        //Subarray Sum Equals K — LC 560
        //
        //Pattern: Prefix Sum + HashMap
        //
        //Input:
        //nums = [1,1,1], k = 2
        //Output:
        //2

        int[] nums = {2, 2, 2};
        int k = 2;

        int l = 0;
        int r = 0;
        int sum = 0;
        int counter = 0;
        while (r < nums.length) {
            sum = sum + nums[r];
            while (sum > k) {
                sum = sum - nums[l];
                l++;
            }
            if (sum == k) {
                counter++;
            }
            r++;

        }
        System.out.println(counter);

    }
}
