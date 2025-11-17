package Strings;
/*
Longest Palindromic Substring

Problem: Find the longest palindromic substring in s.
Example:
Input: "babad"
Output: "bab" or "aba"
 */

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "babad";
        int l = 0, r = input.length(), maxLength = 0;
        String longSubString = "";
        while (r > 0) {
            if (input.substring(l, r).length() > 1 && checkPalindrome(input.substring(l, r))) {
                maxLength = Math.max(maxLength, r - l);
                longSubString = input.substring(l, r);
            }
            r--;
        }

        System.out.println(longSubString);
    }

    private static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
