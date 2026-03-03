package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2};

        int k = 2;

        int maxLength = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < arr.length){
            sum += arr[r];
            while(sum > k){
                sum = sum - arr[l];
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        System.out.println(maxLength);

    }

}
