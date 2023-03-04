package hot100;

public class Hot70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] way = new int[n];
        way[0] = 1;
        way[1] = 2;

        for (int i = 2; i < n; i++) {
            way[i] = way[i - 1] + way[i - 2];
        }

        return way[n - 1];
    }
}
