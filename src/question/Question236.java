package question;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> chainP = new ArrayList<>();
        List<TreeNode> chainQ = new ArrayList<>();
        postOrderTraversal(root, p, chainP);
        postOrderTraversal(root, q, chainQ);

        Set<TreeNode> treeNodeSet = new HashSet<>(chainP);
        for (TreeNode treeNode : chainQ) {
            if (treeNodeSet.contains(treeNode)) {
                return treeNode;
            }
        }

        return null;
    }

    private void postOrderTraversal(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null) {
            return;
        }

        if (root == target) {
            list.add(root);
            return;
        }

        postOrderTraversal(root.left, target, list);
        if (list.isEmpty()) {
            postOrderTraversal(root.right, target, list);
        }

        if (!list.isEmpty()) {
            list.add(root);
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }

}
