package Strings;

import java.util.ArrayList;
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

        Stream<String> stream =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();

        System.out.println(anyElement.get());
        Optional<String> first = stream.findFirst();

    }

}
