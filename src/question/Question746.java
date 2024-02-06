package question;

public class Question746 {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }

        return Math.min(cost[cost.length - 2], cost[cost.length - 1]);
    }
}
