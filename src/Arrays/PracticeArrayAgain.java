package Arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PracticeArrayAgain {
    public static void main(String[] args) {

//        Best Time to Buy and Sell Stock
//
//                [7,1,5,3,6,4] → 5

        int[] arr = {7, 1, 5, 3, 6, 4};
        int totalProfit = 0;

        int buyPrice = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < buyPrice){
                buyPrice = arr[i];
            }else{
                int profit = arr[i] - buyPrice;
                totalProfit = totalProfit + profit;
                buyPrice = arr[i];
            }


        }

        System.out.println(totalProfit);

    }


}
