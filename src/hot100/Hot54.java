package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rs = 0, re = matrix.length;
        int cs = 0, ce = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        while (rs < re && cs < ce) {
            // 遍历首行
            for (int i = cs; i < ce; i++) {
                res.add(matrix[rs][i]);
            }
            rs++;

            // 遍历尾列
            for (int i = rs; i < re; i++) {
                res.add(matrix[i][ce - 1]);
            }
            ce--;

            // 遍历尾行
            if (re == rs) {
                break;
            }
            for (int i = ce - 1; i >= cs; i--) {
                res.add(matrix[re - 1][i]);
            }
            re--;

            if (ce == cs) {
                break;
            }
            // 遍历首列
            for (int i = re - 1; i >= rs; i--) {
                res.add(matrix[i][cs]);
            }
            cs++;
        }
        return res;
    }
}
