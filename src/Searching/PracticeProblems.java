package Searching;

//Merge Sorted Arrays
//
//[1,3,5] + [2,4] → [1,2,3,4,5]

import java.util.Arrays;

public class PracticeProblems {
    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 4, 6};
        int target = 3;

        int result = -1;
        int start = 0;
        int end = arr.length - 1;

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
