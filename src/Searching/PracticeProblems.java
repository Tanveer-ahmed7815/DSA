package Searching;

//First and Last Position of Element
//
//[5,7,7,8,8,10], target=8 → [3,4]

public class PracticeProblems {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;

        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] >= target){
                ceil = mid;
                end = mid -1;

            }else{
                start = mid + 1;
            }
        }

        System.out.println(ceil);


    }
}
