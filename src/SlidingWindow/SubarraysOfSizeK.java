package SlidingWindow;
/*
Average of Subarrays of Size K

Problem:
Return an array of averages of all contiguous subarrays of size k.

Example:
Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], k = 5
Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */

import java.util.ArrayList;
import java.util.List;

public class SubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        float kAvg = 0;
        for (int i = 0; i < k; i++) {
            kAvg = kAvg + arr[i];
        }

        List<Float> listOfAverage = new ArrayList<>();
        listOfAverage.add(kAvg / k);

        int l = 0;
        int r = k;

        while (r < arr.length) {
            float sum = kAvg - arr[l];
            l++;
            kAvg = sum + arr[r];
            listOfAverage.add(kAvg / k);
            r++;
        }

        System.out.println(listOfAverage);
    }
}
