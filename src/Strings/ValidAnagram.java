package Strings;
/*
Valid Anagram

Problem: Return true if two strings are anagrams (same characters, different order).
Example:
Input: "anagram", "nagaram"
Output: true

 */

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaraq";

        if(str1.length() != str2.length()){
            System.out.println(false);
        }
        StringBuilder sb1 = new StringBuilder();
        str1.chars().sorted().forEach(x -> sb1.append((char)x));

        StringBuilder sb2 = new StringBuilder();
        str2.chars().sorted().forEach(x -> sb2.append((char)x));

        System.out.println(sb1.toString().contentEquals(sb2));
    }
}
