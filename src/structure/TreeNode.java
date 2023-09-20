package structure;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode listToTree(Integer[] trees) {
        if (trees.length == 0)
            return null;
        TreeNode[] treeNodes = new TreeNode[trees.length + 1];
        for (int i = 1; i < treeNodes.length; i++) {
            if (trees[i - 1] == null) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(trees[i - 1]);
            }
        }

        TreeNode treeNode;
        //这个只适用于完全二叉树
        //        for (int i = 1; i < treeNodes.length; i++) {
        //            treeNode = treeNodes[i];
        //            if (treeNode == null) continue;
        //            if (2 * i < treeNodes.length)
        //                treeNode.left = treeNodes[2 * i];
        //            if (2 * i + 1 < treeNodes.length)
        //                treeNode.right = treeNodes[2 * i + 1];
        //        }
        for (int i = 1, index = 2; i < treeNodes.length && index < treeNodes.length; i++) {
            treeNode = treeNodes[i];
            if (treeNode == null) continue;
            treeNode.left = treeNodes[index];
            if (index + 1 < treeNodes.length)
                treeNode.right = treeNodes[index + 1];
            index += 2;
        }
        return treeNodes[1];
    }

}
