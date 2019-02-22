package leetcode.playground.tree.sumOfLeftNode;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.helper.TreeNode;

public class Solution {
    public int sumOfLeftNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 0;
        }
        return root.left.data + sumOfLeftNode(root.left) + sumOfLeftNode(root.right);
    }

    public int sumOfLeftNodeQ(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int result = 0;
        while(queue.size() > 0) {
            TreeNode temp = queue.remove();
            if (temp != null) {
                if (temp.left != null) {
                    result += temp.left.data;
                }
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return result;
    }
}