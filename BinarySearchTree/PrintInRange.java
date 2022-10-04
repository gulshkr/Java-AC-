package BinarySearchTree;

//Print in range - Input - k1 = 5 & k2 = 12, output - 5,6,8,11
public class PrintInRange {
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
        innorder(root.right);
    }

    //Print in range function
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
       if(root.data>=k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        innorder(root);
        System.out.println();

        printInRange(root, 5, 12);
        
    }
    
}
