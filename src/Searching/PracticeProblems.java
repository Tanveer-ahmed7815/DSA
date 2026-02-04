package Searching;

//Merge Sorted Arrays
//
//[1,3,5] + [2,4] → [1,2,3,4,5]

import java.util.Arrays;

public class PracticeProblems {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4};
        int i, k, j;
        i = k = j = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }

        }

        if (i < arr1.length) {
            while (i < arr1.length) {
                res[k++] = arr1[i++];
            }
        } else {
            while (j < arr2.length) {
                res[k++] = arr2[j++];
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
