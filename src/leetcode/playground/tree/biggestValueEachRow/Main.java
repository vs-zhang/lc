package leetcode.playground.tree.biggestValueEachRow;

import java.util.Arrays;
import java.util.List;

import leetcode.helper.TreeNode;

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        Solution s = new Solution();
        List<Integer> result = s.biggestValueEachRow(root);
        System.out.println(Arrays.toString(result.toArray()));
    }
}