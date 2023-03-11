package offer;

import java.util.Arrays;

public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[]{};
        }

        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }
}
