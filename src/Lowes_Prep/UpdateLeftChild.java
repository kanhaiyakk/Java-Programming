package Lowes_Prep;

//For a given node in a binary tree, compute the sum of all nodes in its left subtree,
// and update the left child’s value to that sum.
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class UpdateLeftChild {
    public static void updateLeftChildToSubtreeSum(TreeNode root){
        if (root==null || root.left==null) return;
        int  sum=subtreeSum(root.left);
        root.left.data=sum;
    }
    public static int subtreeSum(TreeNode root){
        if (root==null) return 0;
        return root.data+ subtreeSum(root.left)+ subtreeSum(root.right);
    }
    public static void main(String[] args) {
        // Sample tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        updateLeftChildToSubtreeSum(root);

        System.out.println("Updated value of left child: " + root.left.data); // Should print 13
    }
}
