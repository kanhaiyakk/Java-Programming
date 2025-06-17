package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal2 {
    public static List<Integer> preOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    public static void helper(TreeNode root, List<Integer> list){
        if (root==null) return;
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.print("Preorder Traversal: ");
        List<Integer> result = preOrder(root);  // store the result
        for (int val : result) {
            System.out.print(val + " ");         // print each element
        }
    }
}
