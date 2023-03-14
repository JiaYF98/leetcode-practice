package offer;

import structure.TreeNode;

import java.util.ArrayList;

public class Offer68I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> listp = new ArrayList<>();
        ArrayList<TreeNode> listq = new ArrayList<>();

        findPath(root, p, listp);
        findPath(root, q, listq);

        int listpSize = listp.size();
        int listqSize = listq.size();
        TreeNode result = null;
        for (int i = 0; i < listpSize && i < listqSize; i++) {
            if (listp.get(i) == listq.get(i)) {
                result = listp.get(i);
            }
        }

        return result;
    }

    private void findPath(TreeNode root, TreeNode target, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }

        list.add(root);

        if (root == target) {
            return;
        }

        if (root.val > target.val) {
            findPath(root.left, target, list);
        } else {
            findPath(root.right, target, list);
        }
    }
}
