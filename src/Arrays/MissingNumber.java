package Arrays;


/* Find the Missing Number in an Array (1 to N)

Problem:
You are given an array of size N-1 that contains distinct integers from 1 to N. One number is missing. Find the missing number.

Example:
Input: arr = [1, 2, 4, 5], N = 5
Output: 3
Explanation: Only number missing from 1 to 5 is 3.*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;

        int actualSum = Arrays.stream(arr).sum();
        int expectedSum = IntStream.rangeClosed(1,n).sum();
        int missingNumber = expectedSum - actualSum;

        System.out.println(missingNumber);

    }
}
