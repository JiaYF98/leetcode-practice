package hot100;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Hot98 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOrderTraversal(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void midOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        midOrderTraversal(root.left, list);
        list.add(root.val);
        midOrderTraversal(root.right, list);
    }

    public boolean isValidBST2(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long lower, long upper) {
        if (root == null) {
            return true;
        }

        if (root.val <= lower || root.val >= upper) {
            return false;
        }

        return isValidBST(root.left, lower, root.val) && isValidBST(root.right, root.val, upper);
    }
}
