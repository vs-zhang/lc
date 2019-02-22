package leetcode.playground.tree.biggestValueEachRow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.helper.TreeNode;

public class Solution {
    public List<Integer> biggestValueEachRow(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(queue.size() > 0) {
             int mx = Integer.MIN_VALUE; 
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {
                TreeNode temp = queue.remove();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                mx = Math.max(temp.data, mx);
            }
            result.add(mx);
            
        }
        return result;
    }
}
