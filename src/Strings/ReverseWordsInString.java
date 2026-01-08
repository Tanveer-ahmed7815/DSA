package Strings;
/*
Reverse Words in a String

Problem: Reverse word order but keep characters inside word same.
Example:
Input: "the sky is blue"
Output: "blue is sky the"
 */

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "the sky is blue";
        String[] s = input.split(" ");
        String res = "";

        for (int i = s.length - 1; i >= 0  ; i--) {
            res = res + s[i] + " ";
        }

        System.out.println(res.trim());
    }
}
