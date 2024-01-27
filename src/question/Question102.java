package question;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            // Queue<TreeNode> nextQueue = new LinkedList<>();
            List<Integer> subResult = new ArrayList<>();
            // while (!queue.isEmpty()) {
            while (size-- > 0) {
                TreeNode poll = queue.poll();
                subResult.add(poll.val);
                // if (poll.left != null) nextQueue.offer(poll.left);
                // if (poll.right != null) nextQueue.offer(poll.right);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            res.add(subResult);
            // queue.addAll(nextQueue);
        }

        return res;
    }
}
