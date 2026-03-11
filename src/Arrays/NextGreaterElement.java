package Arrays;

import java.util.Arrays;
import java.util.Stack;

/*
Input: arr[] = [1, 3, 2, 4] Output: [3, 4, 4, -1] Input: arr[] = [6, 8, 0, 1, 3] Output: [8, -1, 1, 3, -1] java solution
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);

        }

        System.out.println(Arrays.toString(result));
    }
}
