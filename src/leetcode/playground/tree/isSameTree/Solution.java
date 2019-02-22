package leetcode.playground.tree.isSameTree;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.helper.TreeNode;

public class Solution {
    public Boolean isSameTreeR(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } 
        if (t1 != null && t2 != null && t1.data == t2.data) {
            return isSameTreeR(t1.left, t2.left) && isSameTreeR(t1.right, t2.right);
        }
        return false;
    }


    public Boolean isSameTreeQ(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(t1);
        queue.add(t2);

        while(queue.size() > 0) {
            TreeNode temp1 = queue.remove();
            TreeNode temp2 = queue.remove();

            if (temp1 == null && temp2 == null) {
                return true;
            }

            if (temp1 != null && temp2 != null && temp1.data == temp2.data) {
                queue.add(temp1.left);
                queue.add(temp2.left);
                queue.add(temp1.right);
                queue.add(temp2.right);
            } else {
                return false;
            }

        }
        return true;
    }
}