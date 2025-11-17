package Arrays;
/*
Check Whether Two Arrays Are Equal

Problem:
Given nums1 and nums2, check if both contain the same elements in the same order.
Perform deep comparison if arrays contain nested arrays.

Example 1:

Input: nums1 = [1, 2, 3], nums2 = [1, 2, 3]
Output: true
 */

public class CheckTwoArraysAreEqual {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {1, 2, 3};

        if(nums1.length != nums2.length){
            System.out.println("Not equal");
            return;
        }

        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] != nums2[i]){
                System.out.println("Not equal");
                return;
            }
        }

        System.out.println("Arrays are equal!");


    }
}
