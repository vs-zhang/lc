package leetcode.playground.tree.levelPrint;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.helper.TreeNode;

class Solution {
    public void levelPrintBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while (queue.size() > 0) {
            TreeNode tempNode = queue.remove();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
