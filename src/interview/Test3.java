package interview;
/* Created by ayesh on 12-11-2025 */

/*Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.

Input: arr[] = {2, 3, -8, 7, -1, 2, 3}

Output: 11

Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.*/

public class Test3 {
    public static void main(String[] args) {
        int[] arr= {2, -3, 8, -7, -1, -8, 3};
        int sum = 0;
        int maxSum = 0;
        for(int i =0;i < arr.length; i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);
    }
}
