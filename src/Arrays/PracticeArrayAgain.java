package Arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeArrayAgain {
    public static void main(String[] args) {

//        Product of Array Except Self
//
//        Problem:
//        Return array where each element is product except itself.
//
//                Input:
//        nums = [1,2,3,4]
//        Output:
//        [24,12,8,6]

        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);


    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

}
