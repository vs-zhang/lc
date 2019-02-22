package leetcode.playground.tree.isSameTree;

import leetcode.helper.TreeNode;

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        Boolean isSame = s.isSameTreeR(root1, root2);
        if (isSame) {
            System.out.println("Same Tree");
        } else {
            System.out.println("Not Same");
        }

        Boolean isSameQ = s.isSameTreeQ(root1, root2);
        if (isSameQ) {
            System.out.println("Same Tree");
        } else {
            System.out.println("Not Same");
        }
    }
}