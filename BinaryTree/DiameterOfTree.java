package BinaryTree;
import java.util.*;
//Diameter of aa tree 
public class DiameterOfTree {
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
    //Height of a tree
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);  //lh - left height
        int rh = height(root.right);  //right height
        return Math.max(lh,rh)+1;
    }

    //Diameter finding approach - 1
    public static int diameter2(Node root){  //O(n^2)
        if(root==null){
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam =leftHt+rightHt +1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    //Approach - 2 diameter finding
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info righInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, righInfo.diam), leftInfo.ht + righInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, righInfo.ht) + 1;
        
        return new Info(diam, ht);
    }

    public static void main(String[] args) {
           /*
                     1
                   /  \
                  2    3
                / \   / \ 
               4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).diam);
    }
    
}
