package medium;

import helpFunctions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public void recurPreOrder(TreeNode root, List<Integer> arr){
        if (root == null)
            return ;
        arr.add(root.val);
        recurPreOrder(root.left, arr);
        recurPreOrder(root.right, arr);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        recurPreOrder(root, arr);

        return arr;
    }
}
