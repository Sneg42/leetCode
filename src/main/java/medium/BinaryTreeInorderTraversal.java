package medium;

import helpFunctions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public void traversal(TreeNode node, List<Integer> listNode){
        if (node == null)
            return ;
        if (node.left != null)
            traversal(node.left, listNode);
        listNode.add(node.val);
        if (node.right != null)
            traversal(node.right, listNode);
    }
        public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> listNode = new ArrayList<>();
        traversal(root, listNode);
        return listNode;
    }
}
