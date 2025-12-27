package Searching;
/*
Find Floor of a Number

Problem:
Find the greatest element smaller than or equal to the target.

Example:
Input: arr = [1,2,4,6,8], target = 5
Output: 4
 */

public class FindFloor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target = 7;
        int floor = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(floor);
    }
}
