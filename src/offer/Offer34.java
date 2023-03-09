package offer;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer34 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        traverse(root, target);
        return lists;
    }

    private void traverse(TreeNode root, int target) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.val == target && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(list));
        }

        traverse(root.left, target - root.val);
        traverse(root.right, target - root.val);

        list.remove(list.size() - 1);
    }

}
