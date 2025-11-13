package Strings;
/*
Longest Common Prefix
Problem: Given an array of strings, find the longest prefix common to all.
Example:
Input: ["flower","flow","flight"]
Output: "fl"
*/

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println(prefix);

    }
}
