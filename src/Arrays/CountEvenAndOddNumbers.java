package Arrays;
/*
Count Even and Odd Numbers in an Array

Problem:
Given nums, count how many elements are even and how many are odd.

Example:

Input: nums = [1, 2, 3, 4, 5, 6]
Output: even = 3, odd = 3
 */

public class CountEvenAndOddNumbers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int even = 0;
        int odd = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even + " Odd count: " + odd);

    }

}
