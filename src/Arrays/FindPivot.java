package Arrays;

/*
Find Pivot Index
[1,7,3,6,5,6] → 3
 */
public class FindPivot {
    public static void main(String[] args) {
        int[] numbs = {1, 7, 3, 6, 5, 6};

        int totalSum = 0;
        for (int a : numbs) {
            totalSum += a;
        }

        int leftSum = 0;
        for (int i = 0; i < numbs.length; i++) {
            int rightSum = totalSum - leftSum - numbs[i];
            if (rightSum == leftSum) {
                System.out.println(i);
                break;
            }
            leftSum += numbs[i];
        }
    }
}
