package Searching;

//Example:
//Input: arr = [1,2,4,6,8], target = 5
//Output: 4

import java.util.Arrays;

public class PracticeProblems {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;

        int start = 0;
        int end = arr.length;

       while(start < end){
           int mid = start + (end - start)/2;
           if(arr[mid] == target){
               System.out.println(mid);
               return;
           }

       }

    }


}
