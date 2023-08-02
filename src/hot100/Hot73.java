package hot100;

public class Hot73 {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        boolean row0Flag = false;
        boolean col0Flag = false;

        for (int i = 0; i < rowLength; i++) {
            if (matrix[i][0] == 0) {
                col0Flag = true;
                break;
            }
        }

        for (int j = 0; j < columnLength; j++) {
            if (matrix[0][j] == 0) {
                row0Flag = true;
                break;
            }
        }

        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < columnLength; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }

        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < columnLength; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (row0Flag) {
            for (int j = 0; j < columnLength; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0Flag) {
            for (int i = 0; i < rowLength; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
