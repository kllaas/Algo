package easy;

public class Task746 {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0 || cost.length == 1) return 0;

        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

}
