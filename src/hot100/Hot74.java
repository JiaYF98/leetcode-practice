package hot100;

public class Hot74 {
    /*
    将二维数组逆时针旋转45度，指针指向最上元素，即第一行最后一列
    如果指针指向的数等于目标值，返回 true
    如果指针指向的数比目标值小，则指针往右移动，即行数加一
    如果指针指向的数比目标值大，则指针往左移动，即列数减一
    如果行或者列超出了边界，则返回 false
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length, columnLength = matrix[0].length;
        int left = columnLength - 1, right = 0;

        while (left >= 0 && right < rowLength) {
            if (matrix[right][left] == target)
                return true;
            else if (matrix[right][left] > target)
                left--;
            else
                right++;
        }

        return false;
    }
}
