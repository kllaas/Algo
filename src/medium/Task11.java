package medium;

public class Task11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                maxArea = Math.max(maxArea, height[i] > height[j] ? height[j] * (j - i) : height[i] * (j - i));

                System.out.println(maxArea + ", i = " + i + ", j = " + j + ", Hi = " + height[i] + ", Hj = " + height[j] );
            }
        }

        return maxArea;
    }

}
