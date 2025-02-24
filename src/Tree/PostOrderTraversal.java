package Tree;
class TreeNode1{
    int data;
    TreeNode1 left,right;
    TreeNode1(int data){
        this.data=data;
        left=right=null;
    }
}
public class PostOrderTraversal {

    public static void postOrder(TreeNode1 root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        root.right.right = new TreeNode1(6);

        System.out.print("Preorder Traversal: ");
        postOrder(root);
    }
}
