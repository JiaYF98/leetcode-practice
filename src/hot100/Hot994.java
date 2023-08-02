package hot100;

import java.util.LinkedList;
import java.util.Queue;

public class Hot994 {
    public int orangesRotting(int[][] grid) {
        int time = -1;
        Queue<int[]> queue = new LinkedList<>();

        boolean full = true;
        int rowLength = grid.length;
        int colLength = grid[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    full = false;
                }
            }
        }

        if (full) {
            return 0;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                int r = poll[0], c = poll[1];
                if (r + 1 < rowLength && grid[r + 1][c] == 1) {
                    queue.offer(new int[]{r + 1, c});
                    grid[r + 1][c] = 2;
                }
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    queue.offer(new int[]{r - 1, c});
                    grid[r - 1][c] = 2;
                }
                if (c + 1 < colLength && grid[r][c + 1] == 1) {
                    queue.offer(new int[]{r, c + 1});
                    grid[r][c + 1] = 2;
                }
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    queue.offer(new int[]{r, c - 1});
                    grid[r][c - 1] = 2;
                }
            }
            time++;
        }

        full = true;
        for (int[] ints : grid) {
            for (int j = 0; j < colLength; j++) {
                if (ints[j] == 1) {
                    full = false;
                    break;
                }
            }
        }

        if (!full) {
            return -1;
        } else {
            return time;
        }
    }
}
