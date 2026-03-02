package sorting;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int left = 0;
        int right = arr.length - 1;

        mergeHalf(arr, left, right);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeHalf(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeHalf(arr, left, mid);
        mergeHalf(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
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
