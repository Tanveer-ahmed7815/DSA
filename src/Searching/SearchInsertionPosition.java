package Searching;
/* Created by ayesh on 02-11-2025 */

public class SearchInsertionPosition {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 2;

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                System.out.println(mid);
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        System.out.println(start + 1);

    }
}
