package question;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int flag = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> subRes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                subRes.add(poll);
            }

            for (int i = subRes.size() - 1; i >= 0; i--) {
                TreeNode subNode = subRes.get(i);
                if (flag == -1) {
                    if (subNode.left != null) queue.offer(subNode.left);
                    if (subNode.right != null) queue.offer(subNode.right);
                } else {
                    if (subNode.right != null) queue.offer(subNode.right);
                    if (subNode.left != null) queue.offer(subNode.left);
                }
            }
            res.add(subRes.stream().map(s -> s.val).toList());
            flag *= -1;
        }

        return res;
    }
}
