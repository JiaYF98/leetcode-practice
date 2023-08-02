package hot100;

public class Hot204 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int i = 0, j = columnLength - 1;
        while (i < rowLength && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }

            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
