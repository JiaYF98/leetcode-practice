package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hot118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            return new ArrayList<>(Collections.singletonList(Collections.singletonList(1)));
        }
        if (numRows == 2) {
            return new ArrayList<>(Arrays.asList(Collections.singletonList(1), Arrays.asList(1, 1)));
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(Collections.singletonList(1));
        res.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            // 上一层
            List<Integer> lastList = res.get(i - 1);

            // 本层
            List<Integer> list = new ArrayList<>();
            // 加入第一个元素
            list.add(1);
            // 加入除第一个和最后一个元素，第i层有i+1个元素
            for (int j = 1; j < i; j++) {
                list.add(lastList.get(j - 1) + lastList.get(j));
            }
            // 加入最后一个元素
            list.add(1);
            // 结果加入本层数据
            res.add(list);
        }

        return res;
    }
}
