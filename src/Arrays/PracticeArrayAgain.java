package Arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PracticeArrayAgain {
    public static void main(String[] args) {

//        Max Consecutive Ones
//
//                [1,1,0,1,1,1] → 3


        int[] nums = {1, 1, 0, 1, 1, 1};

        int left = 0;
        int right = 0;

        int maxConsecutiveSize = 0;

        int counter = 0;
        while (right < nums.length) {

            if (nums[right] == 1) {
                counter++;
                maxConsecutiveSize = Math.max(maxConsecutiveSize, right - left + 1);
            } else {
                left = counter + 1;
                counter = 0;
            }
            right++;

        }

        System.out.println(maxConsecutiveSize);

    }


}
