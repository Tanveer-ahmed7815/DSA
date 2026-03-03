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

//Input: nums = [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]
public class PracticeArrayAgain {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;

            }
        }
        System.out.println(Arrays.toString(arr));

    }


}

