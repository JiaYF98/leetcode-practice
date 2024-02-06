package question;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question124 {
    public int maxPathSum(TreeNode root) {
        List<Integer> pathSum = new ArrayList<>();
        postOrderTraversal(root, pathSum);
        return pathSum.stream().max(Integer::compareTo).orElse(pathSum.get(0));
    }

    private void postOrderTraversal(TreeNode root, List<Integer> pathSum) {
        if (root == null) return;

        if (root.left != null) postOrderTraversal(root.left, pathSum);
        if (root.right != null) postOrderTraversal(root.right, pathSum);

        int left = root.left == null ? 0 : root.left.val;
        int right = root.right == null ? 0 : root.right.val;
        int current = root.val;

        int leftAndCurrent = left + current;
        int currentAndRight = current + right;
        int all = left + current + right;

        root.val = Math.max(Math.max(leftAndCurrent, currentAndRight), root.val);
        pathSum.add(Math.max(all, root.val));
    }

    private int ans = Integer.MIN_VALUE;

    public int maxPathSum2(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        dfs(root.right);

        int left = root.left == null ? 0 : root.left.val;
        int right = root.right == null ? 0 : root.right.val;
        int all = left + root.val + right;

        root.val = Math.max(Math.max(left, right), 0) + root.val;
        ans = Math.max(ans, Math.max(all, root.val));
    }
}
