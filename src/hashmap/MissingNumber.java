package hashmap;

/*
Missing Number

[3,0,1] → 2

 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int a : arr) {
            actualSum += a;
        }

        int missingNUmber = expectedSum - actualSum;
        System.out.println(missingNUmber);
    }
}
