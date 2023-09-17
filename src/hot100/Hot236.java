package hot100;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Hot236 {
    private boolean flag = false;

    private TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, Boolean> map = new HashMap<>();
        postOrderTraversal(root, map, p);
        flag = false;
        findLowestCommonAncestor(root, q, map);
        return result;
    }

    private void postOrderTraversal(TreeNode root, Map<TreeNode, Boolean> map, TreeNode target) {
        if (root == null) {
            return;
        }

        // 找到目标节点，将目标节点也放入map中
        if (root == target) {
            flag = true;
            map.put(root, true);
            return;
        }

        // 不是目标节点，则遍历该节点的左子树
        postOrderTraversal(root.left, map, target);
        // 已经找到目标节点，则不再遍历该节点的右子树
        if (!flag) {
            postOrderTraversal(root.right, map, target);
        }

        // 只放入目标节点祖先节点
        if (flag) {
            map.put(root, true);
        }
    }

    private void findLowestCommonAncestor(TreeNode root, TreeNode target, Map<TreeNode, Boolean> map) {
        if (root == null) {
            return;
        }

        // 已经找到目标节点，如果目标节点就是结果，则直接返回结果
        if (root == target) {
            flag = true;
            if (map.getOrDefault(target, false)) {
                result = target;
            }
            return;
        }

        // 没有找到目标节点则遍历该节点的左子树
        findLowestCommonAncestor(root.left, target, map);

        // 如果已经找到目标节点，则不再遍历该节点的右子树
        if (!flag) {
            findLowestCommonAncestor(root.right, target, map);
        }

        // 如果已经找到目标节点，并且还没有得到结果，判断该节点是否是结果
        if (flag && result == null) {
            if (map.containsKey(root)) {
                result = root;
            }
        }
    }
}
