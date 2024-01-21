package interview;

import java.util.Arrays;

public class Interview274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int length = citations.length;
        for (int i = length - 1; i >= 0; i--) {
            if (citations[i] < length - i) {
                return length - i - 1;
            }
        }
        return length;
    }
}
