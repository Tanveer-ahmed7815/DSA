package Arrays;

import java.util.Arrays;

//Move Zeros
//
//[0,1,0,3] → [1,3,0,0]
public class PracticeArrayAgain {
    public static void main(String[] args) {


        int[] arr = {0, 1, 0, 3};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }


}

