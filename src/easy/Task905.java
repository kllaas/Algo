package easy;

import java.util.Arrays;
import java.util.Comparator;

public class Task905 {

    public static void main(String[] args) {
        int[] a = new int[] {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int swapIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int tmp = A[i];
                A[i] = A[swapIndex];
                A[swapIndex++] = tmp;
            }
        }

        return A;
    }

}
