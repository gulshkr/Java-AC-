package BinarySearchTree.Practice;
import java.util.*;
//Practice problem - 5 - Maximum sum BST in Binary tree
public class MaxSumBSTInBinaryTree {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

   class NodeValue{
    public int maxNode, minNode, maxSize;
    
    NodeValue(int minNode,int maxNode,int maxSize){
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
   }

   //Max sum subtree
   public NodeValue largestBSTSubtreeSum(Node root){
    //AN empty tree is a bst of size 0
    if(root == null){
        return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE,0);
    }

        //get values from left and right subtree of current tree
        NodeValue left = largestBSTSubtreeSum(root.left);
        NodeValue right = largestBSTSubtreeSum(root.right);

        //Current node is greater than max in left and smaller than min in right, it is a BST
        if(left.maxNode < root.data && root.data<right.maxNode){
            //It is a BST
            return new NodeValue(Math.min(root.data,left.minNode), Math.max(root.data, right.maxNode), left.maxSize+right.maxSize+1);       
        }

        //Otherwise return [-inf,inf] so that parent can't be valid BST
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize,right.maxSize));
   }

   public int largestBSTSubtree(Node root){
    return largestBSTSubtreeSum(root).maxSize;
   }

    public static void main(String[] args) {
        /*
                      5
                    /   \
                   9     2
                  /       \
                 6         3
                / \  
               8   7    

               Output - 8
        */

        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.right.right.right = new Node(1);

        
        System.out.println(la);
    }
    
}
