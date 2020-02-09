package medium;

import helpFunctions.TreeNode;
import org.junit.Test;

public class TreeMaxProductTest {
    @Test
    public void treeMaxProductTest(){
        TreeMaxProduct test = new TreeMaxProduct();
//        Integer[] arr = {1,2,3,4,5,6};
        Integer[] arr = {1,2, null,3};
        TreeNode tree = TreeNode.createFromArray(arr, null, 0);

//        System.out.println(tree.val);
//        System.out.println(tree.left.val);
//        System.out.println(tree.right.val);
        TreeNode.printTree(tree);
//        test.maxProduct(tree);
    }
}
