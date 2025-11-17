package Strings;
/*
Remove All Adjacent Duplicates
Problem: Remove duplicate adjacent characters repeatedly until no duplicates remain.
Example:
Input: "abbaca"
Output: "ca"
 */

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "abbaca";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(input.charAt(i));
            } else if (stack.peek() != input.charAt(i)) {
                stack.push(input.charAt(i));
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= stack.size(); i++) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
