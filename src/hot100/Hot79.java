package hot100;

import java.util.LinkedList;
import java.util.Queue;

public class Hot79 {
    public boolean exist(char[][] board, String word) {
        Queue<Integer[][]> queue = new LinkedList<>();
        getStart(board, queue, word.charAt(0));

        boolean[][] used = new boolean[board.length][board[0].length];
        return judge(board, used, word, queue, 0);
    }

    private void getStart(char[][] board, Queue<Integer[][]> queue, char startWord) {
        int rowLength = board.length;
        int columnLength = board[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (board[i][j] == startWord) {
                    queue.offer(new Integer[][]{{i, j}});
                }
            }
        }
    }

    private boolean judge(char[][] board, boolean[][] used, String word, Queue<Integer[][]> queue, int index) {
        while (!queue.isEmpty()) {
            Integer[][] peek = queue.peek();
            Integer i = peek[0][0];
            Integer j = peek[0][1];
            used[i][j] = true;

            if (dfs(board, i, j, used, word, index + 1)) {
                return true;
            }

            queue.poll();
            used[i][j] = false;
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, boolean[][] used, String word, int index) {
        // 如果字符全部匹配，返回true
        if (index == word.length()) {
            return true;
        }

        Queue<Integer[][]> queue = new LinkedList<>();

        getNext(board, i - 1, j, used, word, index, queue);
        getNext(board, i + 1, j, used, word, index, queue);
        getNext(board, i, j - 1, used, word, index, queue);
        getNext(board, i, j + 1, used, word, index, queue);

        return judge(board, used, word, queue, index);
    }

    private void getNext(char[][] board, int i, int j, boolean[][] used, String word, int index, Queue<Integer[][]> queue) {
        int rowLength = board.length;
        int columnLength = board[0].length;

        if (i >= 0 && j >= 0 && i < rowLength && j < columnLength && !used[i][j] && board[i][j] == word.charAt(index)) {
            queue.offer(new Integer[][]{{i, j}});
        }
    }
}
