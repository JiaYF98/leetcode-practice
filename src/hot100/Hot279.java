package hot100;

public class Hot279 {
    public int numSquares(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if ((int) (Math.sqrt(n) + 0.1) * (int) (Math.sqrt(n) + 0.1) == n) {
            return 1;
        }

        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for (int i = 2; i < n; i++) {
            if ((int) (Math.sqrt(i + 1) + 0.1) * (int) (Math.sqrt(i + 1) + 0.1) == i + 1) {
                res[i] = 1;
                continue;
            }
            int left = 0;
            int right = i - 1;
            res[i] = 10000;
            while (left <= right) {
                if (res[left] + res[right] == 2) {
                    res[i] = 2;
                    break;
                }
                res[i] = Math.min(res[i], res[left] + res[right]);
                left++;
                right--;
            }
        }

        return res[n - 1];
    }
}
