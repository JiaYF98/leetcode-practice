package offer;

public class Offer10I {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fibArray = new int[n + 1];
        fibArray[0]  = 0;
        fibArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibArray[i] = (fibArray[i - 1] + fibArray[i -2]) % 1000000007;
        }

        return fibArray[n];
    }
}
