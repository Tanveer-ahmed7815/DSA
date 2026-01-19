package stack;
/*
Valid Parentheses

Problem: Check if a string containing ()[]{} pairs is valid (properly nested).
Example:
Input: "({[]})"
Output: true
 */

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String isValid = "({";

        if (isValid.isEmpty()) {
            return;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : isValid.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']') ||
                        (!stack.isEmpty() && ((ch == ')' && stack.pop() != '(') ||
                                (ch == '}' && stack.pop() != '{') ||
                                (ch == ']' && stack.pop() != '[')))) {
                    System.out.println("Invalid");
                    return;
                }

            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}
