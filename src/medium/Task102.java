package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderTraverse(root, res, 0);
        return res;
    }

    private void levelOrderTraverse(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) return;

        if (level <= res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        levelOrderTraverse(root.left, res, level + 1);
        levelOrderTraverse(root.right, res, level + 1);
    }

}
