package leetcode.playground.tree.mirrorTree;

import leetcode.helper.TreeNode;

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        Solution s = new Solution(); 
        Boolean isMirror = s.isMirrorTree(root);
        if (isMirror) {
            System.out.println("is Mirror");
        } else {
            System.out.println("is not Mirror");
        }
    }
}