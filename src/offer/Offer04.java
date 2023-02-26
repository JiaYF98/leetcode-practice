package offer;

public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix[0].length;

        for (int[] ints : matrix) {
            if (target >= ints[0] && target <= ints[m - 1]) {
                if (target == ints[0] || target == ints[m - 1] || binarySearch(ints, target)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int begin = 0;
        int end = matrix.length - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (matrix[middle] == target) {
                return true;
            } else if (matrix[middle] < target) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Offer04 offer04 = new Offer04();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(offer04.findNumberIn2DArray(matrix, 5));
        System.out.println(offer04.findNumberIn2DArray(matrix, 20));
    }
}
