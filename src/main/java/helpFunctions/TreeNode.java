package helpFunctions;

import medium.TreeMaxProduct;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public List<TreeNode> children;

    private static int countNull = 0;

    TreeNode(int x){this.val = x;}

    public static TreeNode createFromArray(Integer[] arr, TreeNode root, int i){
        if (arr.length > 0){
            if (i < arr.length){
                TreeNode node = new TreeNode(arr[i]) ;
                root = node;
                if (arr[i] != null) {
                    if (2 * i + 1 - countNull < arr.length)
                        root.left = createFromArray(arr, root.left, 2*i+1-countNull);
                    if (2 * i + 2 - countNull < arr.length)
                        root.right = createFromArray(arr, root.right, 2*i+2-countNull);
                }else{
                    countNull += 2;
                }
            }
        }
        return root;
    }

    public static void printTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(new TreeNode(Integer.MIN_VALUE));
//        Iterator<TreeNode> iter = queue.iterator();
//        while (iter.hasNext()){
//        TreeNode node = iter.next();
//        queue.forEach(node ->{
        TreeNode node;
        while(!queue.isEmpty()) {
            node = queue.poll();
            if (node == null) {
                System.out.print("NULL ");
            } else if (node.val == Integer.MIN_VALUE && !queue.isEmpty()){
                queue.add(new TreeNode(Integer.MIN_VALUE));
                System.out.println();
            }
            else {
                queue.add(node.left);
                queue.add(node.right);
                System.out.print(node.val + " ");
            }

        }
//        });
    }
}

