package medium;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
        Map<Integer, Integer> inorderQueue = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderQueue.put(inorder[i], i);
        }
        Queue<Integer> preorderQueue = new LinkedList<>();
        for (int i = 0; i < preorder.length ; i++) {
            preorderQueue.add(preorder[i]);
        }
        return buildTree(preorderQueue, inorderQueue, 0, preorder.length-1);
    }

    public TreeNode buildTree(Queue<Integer> preorderQueue, Map<Integer, Integer> inorderMap, int left, int right){
        if (left > right || preorderQueue.isEmpty())
            return null;

        int root = preorderQueue.poll();
        TreeNode node = new TreeNode(root);
        int indexInorder = inorderMap.get(root);
        node.left = buildTree(preorderQueue, inorderMap, left, indexInorder-1);
        node.right = buildTree(preorderQueue, inorderMap, indexInorder+1, right);

        return node;
    }

}
