package hot100;

public class Hot50 {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if ((n & 1) == 0) {
            double binaryPow = myPow(x, n / 2);
            return binaryPow * binaryPow;
        } else if (n < 0) {
            return myPow(x, n + 1) * 1 / x;
        } else {
            return myPow(x, n - 1) * x;
        }
    }
}
