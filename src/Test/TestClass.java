package Test;
/*

*/

public class TestClass {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8};
        int target = 9;

        int start = 0;
        int end = arr.length - 1;
        int floor = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                floor = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(arr[floor]);

    }

}
