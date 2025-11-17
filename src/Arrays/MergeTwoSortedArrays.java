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
        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, nums1.length, nums2.length);

        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
