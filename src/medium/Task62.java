package medium;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Task62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }

    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];

        for (int i = 0; i < m; i++) {
            memo[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            memo[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                memo[i][j] = memo[i-1][j] + memo[i][j-1];
            }
        }

        return memo[m-1][n-1];
    }

    private static int findPaths(int m, int n, int[][] memo) {
        if (memo[m][n] != 0) {
            return memo[m][n];
        }
        if (m == 1 || n == 1) {
            return 1;
        }

        memo[m][n] = findPaths(m, n - 1, memo) + findPaths(m - 1, n, memo);
        return memo[m][n];
    }

 /*   public static int uniquePaths(int m, int n) {
        AtomicInteger pathAmount = new AtomicInteger(0);
        findPaths(m, n, pathAmount);
        return pathAmount.get();
    }

    private static void findPaths(int m, int n, AtomicInteger pathAmount) {
        if (m == 1 && n == 1) {
            pathAmount.incrementAndGet();
            return;
        }

        if (m > 0) {
            findPaths(m - 1, n, pathAmount);
        }

        if (n > 0) {
            findPaths(m, n - 1, pathAmount);
        }
    }*/
}
