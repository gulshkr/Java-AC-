package BinaryTree.Practice;
import java.util.*;
//Check if binary tree is univalued oi not - every node has same value or not for ex - 2,2,2,5,2 output - false
public class IfBinaryTreeIsUnivalued {
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor  under which ddata will come
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean isUnivalued(Node root){
        if(root == null){
            return true;
        }

        if((root.left!=null && root.data!=root.left.data)){
            return false;
        }
        if((root.right!=null && root.data!=root.right.data)){
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }
    
    public static void main(String[] args) {
         /*
                     2
                   /  \
                  2    2    => false as everyone has not the smae value
                / \   
               5  2   
        */
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);

        if(isUnivalued(root)){
            System.out.print("YES");
        } else{
            System.out.print("NO");
        }
        
    }
    
}
