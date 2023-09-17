package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c, '.');
        }

        backtracking(result, n, 0, chessboard);
        return result;
    }

    private void backtracking(List<List<String>> result, int n, int row, char[][] chessboard) {
        if (row == n) {
            result.add(Array2List(chessboard));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (check(chessboard, col, row, n)) {
                chessboard[row][col] = 'Q';
                backtracking(result, n, row + 1, chessboard);
                chessboard[row][col] = '.';
            }
        }
    }

    private List<String> Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for (char[] c : chessboard) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }

    private boolean check(char[][] chessboard, int col, int row, int n) {
        for (int i = 0; i < row; i++) {
            int left = col - (row - i);
            int right = col + (row - i);

            if (chessboard[i][col] == 'Q' || left >= 0 && chessboard[i][left] == 'Q' || right <= n - 1 && chessboard[i][right] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
