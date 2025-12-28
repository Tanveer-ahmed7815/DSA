package Searching;
/*
Search in Nearly Sorted Array

Problem:
In a nearly sorted array (elements may be swapped with adjacent), find a target.

Example:
Input: arr = [2,1,3,5,4], target = 5
Output: 3
 */

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }

            if (mid - 1 >= start && arr[mid - 1] == target) {
                System.out.println(mid - 1);
                break;
            }

            if (mid + 1 <= end && arr[mid + 1] == target) {
                System.out.println(mid + 1);
                break;
            }

            if (target < arr[mid]) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }

        }
    }
}
