package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Stream;

//Check Rotation of Another String
//
//Problem: Return true if s2 is a rotation of s1.
//Example:
//Input: "waterbottle", "erbottlewat"
//Output: true
public class PracticeStringAgain {
    public static void main(String[] args) {

        String s = "aabcccaa";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(count);

        System.out.println(sb);
    }

}
