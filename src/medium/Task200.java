package medium;

public class Task200 {

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    fillIsliandWithZeros(grid, i, j);
                    res++;
                }
            }
        }

        return res;
    }

    public void fillIsliandWithZeros(char[][] grid, int i, int j) {
        if ((i < 0 || i >= grid.length) || (j < 0 || j >= grid[0].length)) {
            return;
        }

        if (grid[i][j] == '0') return;
        grid[i][j] = '0';

        fillIsliandWithZeros(grid, i, j + 1);
        fillIsliandWithZeros(grid, i + 1, j);
        fillIsliandWithZeros(grid, i - 1, j);
        fillIsliandWithZeros(grid, i, j - 1);
    }

}
