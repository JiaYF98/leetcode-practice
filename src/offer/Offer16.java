package offer;

public class Offer16 {
    public double myPow(double x, int n) {
        if (n == -1)
            return 1 / x;
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        if (n % 2 == 0) {
            double binaryPow = myPow(x, n / 2);
            return binaryPow * binaryPow;
        } else if (n > 0) {
            return myPow(x, n - 1) * x;
        } else {
            return myPow(x, n + 1) * (1 / x);
        }
    }
}
