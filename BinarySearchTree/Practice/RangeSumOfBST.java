package BinarySearchTree.Practice;
import java.util.*;
//Practice question - 1 - Range Sum of  BST 
public class RangeSumOfBST {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int sum = 0;
    //Range sum BST func
    static int rangeSumBST(Node root,int low,int high){
        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.isEmpty() == false){
            Node curr = q.peek();
            q.remove();
            if(curr.data>=low && curr.data<=high){
                sum+=curr.data;
            }

            if(curr.left != null && curr.data>low){
                q.add(curr.left);
            }
            if(curr.right!=null && curr.data<high){
                q.add(curr.right);
            }
        }
        return sum;

    }

    //Insert func
    static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data <= root.data){
            root.left = insert(root.left, data);
        } else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root,10);
        insert(root,5);
        insert(root,15);
        insert(root,3);
        insert(root,7);
        insert(root,18);

        int L = 7, R = 15;
        System.out.print(rangeSumBST(root, L, R)  );
    }
    
}
