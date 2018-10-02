package medium;

public class Task63 {

    public static void main(String[] args) {
        int[][] multi = new int[][]{
                {1}
        };

        System.out.println(uniquePathsWithObstacles(multi));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) return 0;
        int y = obstacleGrid.length;
        int x = obstacleGrid[0].length;

        int memo[][] = new int[y][x];

        for (int i = 0; i < y; i++) {
            if (obstacleGrid[i][0] == 1) break;
            memo[i][0] = 1;
        }

        for (int i = 0; i < x; i++) {
            if (obstacleGrid[0][i] == 1) break;
            memo[0][i] = 1;
        }

        for (int i = 1; i < y; i++) {
            for (int j = 1; j < x; j++) {
                memo[i][j] = obstacleGrid[i][j] == 1 ? 0 : (memo[i-1][j] + memo[i][j-1]);
            }
        }

        return memo[y-1][x-1];
    }

}
