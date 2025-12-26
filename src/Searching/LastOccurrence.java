package Searching;
/*
Last Occurrence of an Element

Problem:
Find the last occurrence of a target in a sorted array.

Example:
Input: arr = [2,4,4,4,6], target = 4
Output: 3
 */

import java.util.Arrays;

public class LastOccurrence {

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 6, 6};
        int target = 6;

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
