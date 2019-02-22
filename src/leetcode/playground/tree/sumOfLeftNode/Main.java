package leetcode.playground.tree.sumOfLeftNode;

import leetcode.helper.TreeNode;

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(2);
        Solution s = new Solution();
        int result = s.sumOfLeftNode(root);
        int resultQ = s.sumOfLeftNodeQ(root);
        System.out.println(result);
        System.out.println(resultQ);
    }
}