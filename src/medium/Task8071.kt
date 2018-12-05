package medium

object Task807 {

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = null
        println(maxIncreaseKeepingSkyline(
                arrayOf(intArrayOf(3, 0, 8, 4),
                        intArrayOf(2, 4, 5, 7),
                        intArrayOf(9, 2, 6, 3),
                        intArrayOf(0, 3, 1, 0)
                )))
    }

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val fromTop = IntArray(grid[0].size)
        val fromLeft = IntArray(grid.size)

        for (i in grid.indices) {
            for (j in grid.indices) {
                if (grid[i][j] > fromLeft[j]) {
                    fromLeft[j] = grid[i][j]
                }

                if (grid[i][j] > fromTop[i]) {
                    fromTop[i] = grid[i][j]
                }
            }
        }

        var result = 0

        for (i in grid.indices) {
            for (j in grid.indices) {
                val selected = if (fromLeft[j] > fromTop[i]) fromTop[i] else fromLeft[j]
                result += selected - grid[i][j]
            }
        }

        return result
    }

}
