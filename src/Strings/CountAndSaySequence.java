package Strings;
/*
Count and Say Sequence
Problem: Return the nth term of the "count and say" sequence.
Example:
Input: n = 4
Output: "1211"
 */

public class CountAndSaySequence {
    public static void main(String[] args) {
        int n = 4;

        String s = countAndSay(n);
        System.out.println(s);
    }

    private static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        String res = "";
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter++;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                res = res + counter + s.charAt(i);
                counter = 0;
            }


        }

        return res;
    }
}
