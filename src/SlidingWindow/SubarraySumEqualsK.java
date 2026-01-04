package SlidingWindow;
/*
Subarray Sum Equals K

Input:
nums = [1,1,1], k = 2
Output:
2
 */

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2};
        int k = 2;

        int count = 0;
        int l = 0;
        int r = 0;

        int sum = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }
            if (sum == k) {
                count = count + 1;
            }
            r++;
        }

        System.out.println(count);

    }
}
