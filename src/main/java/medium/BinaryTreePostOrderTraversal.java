package medium;

import helpFunctions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {
    private void traversal(TreeNode node, List<Integer> listNode){
        if (node == null)
            return ;
        if (node.left != null)
            traversal(node.left, listNode);
        if (node.right != null)
            traversal(node.right, listNode);
        listNode.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> listNode = new ArrayList<>();
        traversal(root, listNode);
        return listNode;
    }
}
