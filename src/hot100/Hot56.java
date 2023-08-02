package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hot56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> results = new ArrayList<>();

        int[][] sortedIntervals = Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(ints -> ints[0]))
                .toArray(int[][]::new);

        results.add(sortedIntervals[0]);

        Arrays.stream(sortedIntervals).forEach(sortedInterval -> {
            int size = results.size();
            int[] res = results.get(size - 1);

            if (sortedInterval[0] <= res[1]) {
                if (sortedInterval[1] > res[1]) {
                    res[1] = sortedInterval[1];
                }
                results.set(size - 1, res);
            } else {
                results.add(sortedInterval);
            }

        });

        return results.toArray(new int[0][]);
    }

    public int[][] merge2(int[][] intervals) {
        List<int[]> results = new ArrayList<>();

        Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(ints -> ints[0]))
                .forEach(sortedInterval -> {

                    int size = results.size();
                    if (size == 0) {
                        results.add(sortedInterval);
                        return;
                    }

                    int[] res = results.get(size - 1);

                    if (sortedInterval[0] <= res[1]) {
                        if (sortedInterval[1] > res[1]) {
                            res[1] = sortedInterval[1];
                        }
                        results.set(size - 1, res);
                    } else {
                        results.add(sortedInterval);
                    }

                });

        return results.toArray(new int[0][]);
    }
}
