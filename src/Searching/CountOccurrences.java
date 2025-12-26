package Searching;
/*
Count Occurrences in Sorted Array

Problem:
Count how many times a number appears in a sorted array.

Example:
Input: arr = [1,2,2,2,3], target = 2
Output: 3
 */

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int target = 2;

        int start = 0;
        int end = arr.length - 1;

        int firstOccurence = findFirstOccurence(arr, target, start, end);
        int lastOccurence = findLastOccurence(arr, target, start, end);
        int countOccurence = lastOccurence - firstOccurence + 1;
        System.out.println(countOccurence);
    }

    private static int findFirstOccurence(int[] arr, int target, int start, int end) {
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return result;
    }

    private static int findLastOccurence(int[] arr, int target, int start, int end) {
        int result = 0;
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

        return result;
    }
}
