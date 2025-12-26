package Searching;
/*
First Occurrence of an Element

Problem:
Find the first occurrence of a target in a sorted array with duplicates.

Example:
Input: arr = [2,4,4,4,6], target = 4
Output: 1
*/

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 6};
        int target = 4;

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start < end) {

            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                end = mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(end);

    }
}
