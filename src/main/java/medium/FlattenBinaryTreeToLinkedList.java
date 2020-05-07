package medium;

import sun.reflect.generics.tree.Tree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class FlattenBinaryTreeToLinkedList {

    public  void flatten(TreeNode root){
        if (root == null)
            return ;

        helper(root);
    }
    public TreeNode helper(TreeNode root){
        if (root == null)
            return null;

        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;

        TreeNode leftSubTreeLastNode = root.left;
        TreeNode rightSubTreeLastNode = root.right;

        if (leftSubTree == null)
            leftSubTreeLastNode = root;
        else
            leftSubTreeLastNode = helper(root.left);

        if (rightSubTree == null){
            //If right subtree is null, then last node of left subtree will be last node of right subtree as well
            rightSubTreeLastNode = leftSubTreeLastNode;
        }else
            rightSubTreeLastNode = helper(root.right);

        root.right = leftSubTree;
        root.left = null;
        leftSubTreeLastNode.right = rightSubTree;

        //Leaf node will return itself as rightSubTreeLastNode
        return rightSubTreeLastNode;
    }
}
