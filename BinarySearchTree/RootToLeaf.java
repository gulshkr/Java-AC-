package BinarySearchTree;
import java.util.*;
//Question - Root to leaf paths - we have to calculate or find out all  possible path from root to leaf 
public class RootToLeaf {
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

    //print path function
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    //Root to leaf function
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        //  int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        innorder(root);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
        
    }
}
