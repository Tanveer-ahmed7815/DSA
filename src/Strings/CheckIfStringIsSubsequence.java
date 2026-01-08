package Strings;
/*
Check if String is Subsequence

Example:
Input: s="abc", t="ahbgdc"
Output: true
 */

public class CheckIfStringIsSubsequence {
    public static void main(String[] args) {
        String s = "abca";
        String t = "ahbgdca";

        boolean b = checkStringSubsequence(s, t);
        System.out.println(b);
    }

    private static boolean checkStringSubsequence(String s, String t) {

        int prevIndex = -1;
        for (char c : s.toCharArray()) {
            int currIndex = t.indexOf(c, prevIndex + 1);
            if (currIndex > prevIndex) {
                prevIndex = currIndex;
            } else {
                return false;
            }

        }
        return true;
    }
}
