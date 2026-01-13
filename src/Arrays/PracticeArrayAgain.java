package Arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PracticeArrayAgain {
    public static void main(String[] args) {

//        Running Sum of Array
//
//        [1,2,3] → [1,3,6]


        int[] nums = {1, 7, 3, 6, 5, 6};

        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            } else {
                leftSum = leftSum + nums[i];
            }
        }


    }


}
