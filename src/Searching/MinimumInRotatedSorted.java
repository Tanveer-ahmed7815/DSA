package Searching;
/*
Minimum in Rotated Sorted Array

Problem:
Find the minimum element in a rotated sorted array.

Example:
Input: arr = [3,4,5,1,2]
Output: 1
 */

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        System.out.println(arr[start]);
    }
}
