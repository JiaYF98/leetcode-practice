package offer;

public class Offer10II {
    public int numWays(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] numWaysArray = new int[n + 1];
        numWaysArray[0] = 1;
        numWaysArray[1] = 1;

        for (int i = 3; i <= n; i++) {
            numWaysArray[i] = (numWaysArray[i - 1] + numWaysArray[i - 2]) % 1000000007;
        }

        return numWaysArray[n];
    }
}
