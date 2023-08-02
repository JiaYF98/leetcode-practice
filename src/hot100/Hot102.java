package hot100;

import structure.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class Hot102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(Collections.singletonList(root.val));

        while (!queue.isEmpty()) {
            Queue<TreeNode> subQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    subQueue.offer(node.left);
                }

                if (node.right != null) {
                    subQueue.offer(node.right);
                }
            }

            if (!subQueue.isEmpty()) {
                result.add(subQueue.stream().map(node -> node.val).collect(Collectors.toList()));
                queue.addAll(subQueue);
            }
        }

        return result;
    }
}
