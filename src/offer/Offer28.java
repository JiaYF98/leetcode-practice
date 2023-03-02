package offer;

import structure.TreeNode;

public class Offer28 {
    private boolean isSubSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSubSymmetric(left.left, right.right) && isSubSymmetric(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSubSymmetric(root.left, root.right);
    }
}
