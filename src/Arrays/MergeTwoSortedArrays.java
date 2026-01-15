package Arrays;
/*
Merge Two Sorted Arrays into One Sorted Array

Problem:
You are given two sorted arrays nums1 and nums2. Merge them into a single sorted array.

Example 1:

Input: nums1 = [1, 3, 5], nums2 = [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]
 */

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        int[] res = new int[nums1.length + nums2.length];

        int i, j, k;
        i = k = j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            res[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            res[k++] = nums2[j++];
        }

        System.out.println(Arrays.toString(res));
    }
}
