package FlipkartDsaPrep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Node1 {
    int data;
    Node left, right;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LeftViewBT {
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                Node node2 =queue.poll();
                if (i==0){
                    list.add(node2.data);
                }
                if (node2.left!=null) queue.add(node2.left);
                if (node2.right!=null) queue.add(node2.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);

        List<Integer> leftViewResult = leftView(root);
        System.out.println(leftViewResult);  // Output: [1, 2, 4, 7]
    }

}
