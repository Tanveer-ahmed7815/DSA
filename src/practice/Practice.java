package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String str = "abcdabceabcfabch";
        String substr = "abc";

        int count = 0;

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            if(str.substring(i, i+substr.length()).equals(substr)){
                count++;
            }
        }
        System.out.println(count);
    }
}
