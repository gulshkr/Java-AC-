package BinarySearchTree;

import javax.xml.transform.Source;

public class ValidateBST {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //Insert in a binary search tree
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

     //Inorder traversal
     public static void innorder(Node root){
        if(root == null){
            return;
        }
        innorder(root.left);
        System.out.print(root.data+" ");
    }

    //valid bst
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max!=null && root.data >= max.data){
            return false;
        }
        
        return isValidBST(root.left , min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        innorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("Is valid ");
        } else{
            System.out.println("Not valid");
        }
    }
    
}
