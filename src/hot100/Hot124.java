package hot100;

import structure.TreeNode;

public class Hot124 {
    private int result = -1001;

    public int maxPathSum(TreeNode root) {
        return Math.max(getMaxPathSum(root), result);
    }

    private int getMaxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            result = Math.max(root.val, result);
            return root.val;
        }

        int left = -1001;
        int right = -1001;
        if (root.left != null) {
            left = getMaxPathSum(root.left);
        }
        if (root.right != null) {
            right = getMaxPathSum(root.right);
        }

        result = Math.max(result, Math.max(left + root.val, Math.max(right + root.val, Math.max(left + right + root.val, root.val))));

        return Math.max(left + root.val, Math.max(right + root.val, root.val));
    }
}
