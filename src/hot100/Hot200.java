package hot100;

import java.util.LinkedList;
import java.util.Queue;

public class Hot200 {
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int num = 0;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }

                queue.offer(new int[]{i, j});

                while (!queue.isEmpty()) {
                    int[] poll = queue.poll();
                    int r = poll[0], c = poll[1];
                    if (r >= 0 && r < rowLength && c >= 0 && c < colLength && grid[r][c] == '1') {
                        grid[r][c] = '0';
                        queue.offer(new int[]{r - 1, c});
                        queue.offer(new int[]{r + 1, c});
                        queue.offer(new int[]{r, c - 1});
                        queue.offer(new int[]{r, c + 1});
                    }
                }
                num++;
            }
        }

        return num;
    }
}
