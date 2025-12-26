package Searching;

//Example:
//Input: arr = [1,3,5,6], target = 2
//Output: 1

public class PracticeProblems {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(start + 1);
    }
}
