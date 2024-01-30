package question;

import java.util.ArrayList;
import java.util.List;

public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i <= row / 2; i++) {
            for (int j = i; j < column - i && row - 1 - i >= i; j++) {
                res.add(matrix[i][j]);
            }

            for (int j = i + 1; j < row - i && column - 1 - i >= i; j++) {
                res.add(matrix[j][column - 1 - i]);
            }

            for (int j = column - 1 - i - 1; j >= i && row - 1 - i != i; j--) {
                res.add(matrix[row - 1 - i][j]);
            }

            for (int j = row - 1 - i - 1; j > i && column - 1 - i != i; j--) {
                res.add(matrix[j][i]);
            }
        }

        return res;
    }
}
