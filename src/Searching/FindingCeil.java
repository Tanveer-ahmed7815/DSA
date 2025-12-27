package Searching;
/*
Find Ceil of a Number

Problem:
Find the smallest element greater than or equal to the target.

Example:
Input: arr = [1,2,4,6,8], target = 5
Output: 6
 */

public class FindingCeil {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target = 3;

        int start = 0;
        int end = arr.length - 1;

        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ceil = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ceil);
    }
}
