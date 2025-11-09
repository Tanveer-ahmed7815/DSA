package Arrays;

/*Find the Duplicate Number(s) in an Array

Problem:
Given an array of size N containing numbers from 1 to N-1, at least one number is repeated. Return all duplicate numbers.

Example:
Input: arr = [1, 3, 4, 2, 2, 3]
Output: [2, 3]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {2,2,2,3,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Set<Integer> res = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                res.add(arr[i]);
            }
        }

        System.out.println(res);

    }

}
