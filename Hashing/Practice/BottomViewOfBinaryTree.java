// hd - horizontal distance of current node from root     
package Hashing.Practice;
import java.util.*;
public class BottomViewOfBinaryTree {
    static class Node{
        int data;
        int hd;
        Node left,right;

        public Node(int key){
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            
        }
    }

    public static void bottomViewHelper(Node root,int curr,int hd,TreeMap<Integer,int[]> m){
        if(root == null){
            return;
        }

        //if node for a particular HD is not present, add to the map
        if(!m.containsKey(hd)){
            m.put(hd, new int[]{root.data,curr});
        }

        //compare height for already
        //present node at similar horizontal
        //distance
        else{
            int [] p = m.get(hd);
            if(p[1]<=curr){
                p[1] = curr;
                p[0] = root.data;
            }
            m.put(hd,p);
        }
        //call for left subtree
        bottomViewHelper(root.left, curr+1, hd-1, m);

        //call for right subtree
        bottomViewHelper(root.right, curr+1, hd+1, m);
    }

    public static void printBottomView(Node root){
        //Map to store Horizontal Distance, Heights and Data
        TreeMap<Integer,int []> m = new TreeMap<>();

        bottomViewHelper(root, 0, 0, m);

        //Prints the values stored by printBottomViewUtil()
        for(int val[] : m.values()){
            System.out.println(val[0] + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println("bottom view of the given binary tree: ");
        printBottomView(root);
    }
    
}
