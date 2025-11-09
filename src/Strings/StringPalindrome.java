package Strings;

/*Check if a String is Palindrome

Problem: Return true if the string reads the same forward and backward, ignoring cases and non-alphanumeric characters.
Example:
Input: "A man, a plan, a canal: Panama"
Output: true*/

public class StringPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
            }
        }

        String checkPalindromeString = sb.toString();
        boolean checkedPalindrome = checkPalindrome(checkPalindromeString);
        if (checkedPalindrome) {
            System.out.println("The given String is Palindrome");
        } else {
            System.out.println("The given String is not Palindrome");
        }

    }

    private static boolean checkPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
}
