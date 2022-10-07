package BinarySearchTree.Practice;
// import java.util.*;
//Practice problem - 3 - FInd the Kth smallest element in BST - ❌❌❌❌❌ -- doubt in this
public class FindKthSmallestElement {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int count = 0;
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

    //Kth smallest function
    public static Node kthSmallestElement(Node root, int k ){
        if(root == null){
            return null;
        }
        Node left = kthSmallestElement(root.left, k);
        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }
        return kthSmallestElement(root.right, k);
    }

    public static void printKthSmallestElement(Node root,int k){
        Node res = kthSmallestElement(root, k);
        if(res == null){
            System.out.println("there are less nodes than k ");
        } else{
            System.out.println("K-th smallest element is "+res.data);
        }
    }
    public static void main(String[] args) {
        /*
                     8
                   /   \
                  5     11
                 / \      \
                3   6     20   
                input - k = 3
                output - 6 
        */
        Node root = null;
        int keys[] = {20,8,22,4,12,10,14};
        for(int x : keys)
            root = insert(root, x);

        int k = 3;
        printKthSmallestElement(root, k);

    }
    
}
