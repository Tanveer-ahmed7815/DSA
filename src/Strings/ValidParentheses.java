package Strings;
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
        String input = "({[]})";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                stack.push(input.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    if ((input.charAt(i) == ']' && stack.pop() != '[') ||
                            (input.charAt(i) == '}' && stack.pop() != '{') ||
                            (input.charAt(i) == ')' && stack.pop() != '(')) {

                        System.out.println("Invalid Parentheses");
                        break;
                    }
                }else{
                    System.out.println("Invalid Parentheses");
                    break;
                }
            }

        }

    }


}
