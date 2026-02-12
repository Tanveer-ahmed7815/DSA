package Arrays;

import java.util.Arrays;

//Move Zeros
//
//[0,1,0,3] → [1,3,0,0]
public class PracticeArrayAgain {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        //1,3,6

        int totalSum = Arrays.stream(arr).sum();
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println(arr[i]);
                break;
            }
            leftSum += arr[i];

        }



    }


}


class Singteton{
    private Singteton(){

    }
    private static final Singteton instance = new Singteton();

    public static Singteton getInstance(){
        return instance;
    }
}
