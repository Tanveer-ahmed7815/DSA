package Arrays;
/*
Rotate the elements of nums by k positions.
If rotating right, move last k elements to the front; if rotating left, move first k elements to the end.
 */

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        //output = [5, 6, 7, 1, 2, 3, 4]
        int start = 0;
        int end = nums.length - 1;
        k = k % nums.length;
        //7,6,5,4,3,2,1
        //RIGHT
        swapRightOrLeft(nums, start, end);
        swapRightOrLeft(nums, k, end);
        swapRightOrLeft(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));

//        Input: nums = [1, 2, 3, 4, 5], k = 4
//        Output: [ 4, 5, 1, 2, 3]
        //LEFT
        int[] arr = {1, 2, 3, 4, 5};
        int k1 = 4;
        int s = 0;
        int e = arr.length - 1;
        k1 = k1 % arr.length;

        //5,4,3,2,1
        swapRightOrLeft(arr, s, k1 - 1);
        //3,4,5,2,1
        swapRightOrLeft(arr, k1, e);

        swapRightOrLeft(arr, 0, e);

        System.out.println(Arrays.toString(arr));
    }

    private static void swapRightOrLeft(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
