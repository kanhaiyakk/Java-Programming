package FlipkartDsaPrep;
public class BinarySearchTree {
    public static boolean isBST(Node root){
return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean isBSTUtil(Node root, int min, int max){
        if (root==null) return true;
        if (root.data<=min  || root.data >= max) return false;
        return  isBSTUtil(root.left,min,root.data) && isBSTUtil(root.right,root.data,max);
    }

}
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearchTree sol = new BinarySearchTree();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println(sol.isBST(root) ? true : false); // Output: Valid BST
    }
}
