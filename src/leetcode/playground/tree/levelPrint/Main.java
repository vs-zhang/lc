package leetcode.playground.tree.levelPrint;

import leetcode.helper.TreeNode;

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode bt = new TreeNode(1);
        bt.left = new TreeNode(2);
        bt.right = new TreeNode(3);
        bt.right.left = new TreeNode(4);
        bt.right.right = new TreeNode(5);
        bt.right.right.right = new TreeNode(6);
        s.levelPrintBinaryTree(bt);
    }
}
