package Tree;

class TreeNode2{
    int data;
    TreeNode2 left,right;
    TreeNode2(int data){
        this.data=data;
        left=right=null;
    }
}
public class InOrderTraversal {
    public static void inOrder(TreeNode2 root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.right.right = new TreeNode2(6);

        System.out.print("Preorder Traversal: ");
        inOrder(root);
    }
}
