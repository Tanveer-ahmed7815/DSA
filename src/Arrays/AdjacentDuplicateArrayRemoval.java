package Arrays;
/*
Adjacent Duplicate Array Removal

Problem:
Remove adjacent duplicates in an array repeatedly until no more can be removed.

Example:
Input: [1, 2, 2, 3, 3, 3, 2]
Output: [1, 3, 2]
 */

import java.util.Arrays;
import java.util.Stack;

public class AdjacentDuplicateArrayRemoval {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 3, 2};

        Stack<Integer> stack = new Stack<>();

        for (int i : input) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (stack.peek() != i) {
                stack.push(i);
            } else {
                stack.pop();
            }
        }

        int[] res = new int[stack.size()];
        int size = stack.size();
        for (int i = size - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        System.out.println(Arrays.toString(res));
    }
}
