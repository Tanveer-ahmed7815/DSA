package Strings;
/*
Check Rotation of Another String
Problem: Return true if s2 is a rotation of s1.
Example:
Input: "waterbottle", "erbottlewat"
Output: true
 */

public class CheckRotationOfAnotherString {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        for (int i = 0; i < s1.length(); i++) {
            s1 = s1.substring(i) + s1.substring(0, i);
            if(s1.equals(s2)){
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);

    }
}
