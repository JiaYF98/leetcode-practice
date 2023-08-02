package hot100;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Hot230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        getKthSmallest(root, list);
        return list.get(k - 1);
    }

    private void getKthSmallest(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        getKthSmallest(root.left, list);
        list.add(root.val);
        getKthSmallest(root.right, list);
    }
}
