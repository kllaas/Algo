package hard;

import java.util.ArrayList;
import java.util.List;

public class Task42 {

    public static void main(String[] args) {
    }

    public static int trap(int[] height) {
        int res = 0;
        int localMax = height[0];
        int localMaxIndex = 0;

        for (int i = 1; i < height.length; i++) {

            if (height[i] >= localMax) {

                for (int j = localMaxIndex + 1; j <= i - 1; j++) {
                    res += localMax - height[j];
                }

                localMax = height[i];
                localMaxIndex = i;
            }

        }

        return res;
    }

}
