package leetcode.playground.tree.mirrorTree;

import leetcode.helper.TreeNode;

public class Solution {
    public Boolean isMirrorTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkLeftRightTree(root.left, root.right);
    }

    Boolean checkLeftRightTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 != null && t2 != null && t1.data == t2.data) {
            return checkLeftRightTree(t1.left, t2.right) && checkLeftRightTree(t1.right, t2.left);
        }
        return false;
    }

}