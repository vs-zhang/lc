package acm.tree;

public class BinaryTree {
    TreeNode root;

    BinaryTree(int d) {
        root = new TreeNode(d);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(5);
        bt.root.left  = new TreeNode(1);
        bt.root.right = new TreeNode(6);
        System.out.println(bt.root.data);
        System.out.println(bt.root.left.data);
        System.out.println(bt.root.right.data);
        Solution s = new Solution();
        System.out.println(s.isBst(bt.root));
    }
}
