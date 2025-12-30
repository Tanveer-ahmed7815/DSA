package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

//Check Rotation of Another String
//
//Problem: Return true if s2 is a rotation of s1.
//Example:
//Input: "waterbottle", "erbottlewat"
//Output: true
public class PracticeStringAgain {
    public static void main(String[] args) {

        String input = "waterbottle";
        // aterbottlew
        // terbottlew a
        String input2 = "erbottlewat";
        String res = input;
        for (int i = 0; i < input.length(); i++) {
            res = res.substring(1) + input.charAt(i);
            if (res.equals(input2)) {
                System.out.println("Equal");
                break;
            }
        }

    }

}
