package medium;

import java.util.Arrays;
import java.util.Comparator;

public class Task474 {

    public static void main(String[] args) {
        System.out.println(
                findMaxForm(new String[]{"111", "1000", "1000", "1000"}, 9, 3));
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        Arrays.sort(strs, (Comparator.comparingInt(String::length)));
        int res = 0;
        return res;
    }

}
