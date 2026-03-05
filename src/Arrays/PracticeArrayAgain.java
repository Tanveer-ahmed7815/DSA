package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

//Input: nums = [1, 1, 2, 2, 3]
//Output: [1, 2, 3]
public class PracticeArrayAgain {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[k++] = arr[i];
            }
        }



    }

}

