package offer;

import structure.TreeNode;

public class Offer68II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q)
            return root;

        boolean isLeftp = findTarget(root.left, p);
        boolean isLeftq = findTarget(root.left, q);

        if (isLeftp && isLeftq) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (!isLeftp && !isLeftq) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }

    private boolean findTarget(TreeNode root, TreeNode target) {
        if (root == target)
            return true;

        if (root == null)
            return false;

        return findTarget(root.left, target) || findTarget(root.right, target);
    }

    /*
    题解思路
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

}
