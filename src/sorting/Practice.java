package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int start = 0;
        int end = arr.length - 1;

        mergeHalf(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeHalf(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeHalf(arr, start, mid);
        mergeHalf(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int[] temp = new int[right - left + 1];
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);

    }


}
