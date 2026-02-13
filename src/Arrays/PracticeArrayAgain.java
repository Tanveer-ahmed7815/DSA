package Arrays;

import java.util.Arrays;

//Move Zeros
//
//[0,1,0,3] → [1,3,0,0]
public class PracticeArrayAgain {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        //1,3,6
        int[] res = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res[i] = sum;

        }
        System.out.println(Arrays.toString(res));

    }


}

