package easy;

import helpFunctions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class N_arrayTreePreorder {

    public void recurPreOrder(TreeNode root, List<Integer> arr){
        if (root == null)
            return ;
        arr.add(root.val);
        if (!root.children.isEmpty()){
            recurPreOrder(root.children.remove(0), arr);
        }
    }
    public List<Integer> preorder(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        recurPreOrder(root, arr);

        return arr;
    }
}
