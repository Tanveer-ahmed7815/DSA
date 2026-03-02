package sorting;

import java.util.Arrays;

/*
Build sorted array one element at a time (like sorting cards).
⏱ Complexity
Best: O(n)
Worst: O(n²)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
