package Searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int target = 40;

        int start = 0;
        int end = arr.length - 1;

        System.out.println(findBinarySearch(arr, target, start, end));

    }

    private static int findBinarySearch(int[] arr, int target, int start, int end) {

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return findBinarySearch(arr, target, start, mid - 1);
        } else {
            return findBinarySearch(arr, target, mid + 1, end);
        }
    }
}
