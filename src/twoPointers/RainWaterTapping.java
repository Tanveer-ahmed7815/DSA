package twoPointers;

public class RainWaterTapping {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] left = new int[height.length];
        left[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea += Math.min(left[i], right[i]) - height[i];
        }
        System.out.println(maxArea);
    }
}
