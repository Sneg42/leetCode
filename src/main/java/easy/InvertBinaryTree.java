package easy;

import helpFunctions.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
     return root;
    }
}
