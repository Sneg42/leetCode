package medium;

import helpFunctions.TreeNode;

public class TreeMaxProduct {
    private long res;

    private long sum(TreeNode root, long total){
        if (root == null)
            return 0L;
        long s = sum(root.left, total) + sum(root.right, total) + root.val;
        res = Math.max(res, (total - s) * s);
        return s;
    }

    public int maxProduct(TreeNode root){
        long total = sum(root, 0);
        sum(root, total);

        return (int)(res%(1_000_000_007));
    }
}
