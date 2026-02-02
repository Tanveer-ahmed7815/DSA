package Arrays;

import java.util.Arrays;

/*
Running Sum of Array

[1,2,3] → [1,3,6]
 */
public class RangeOfSum {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3};
        int[] res = new int[numbs.length];
        int sum = 0;

        for (int i = 0; i < numbs.length; i++) {
            sum += numbs[i];
            res[i] = sum;
        }

        System.out.println(Arrays.toString(res));
    }
}
