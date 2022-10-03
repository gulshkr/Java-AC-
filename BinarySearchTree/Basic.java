package BinarySearchTree;

public class Basic {
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

    //Search in binary search tree
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }

    //Delete in binary search treee
    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        int values[] = {8,9,7,1,4,3,2,5,6,10};
        Node root = null;

        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        innorder(root);
        System.out.println();

        if(search(root, 11)){
            System.out.println("Found");
        } else{
            System.out.println("Not found");
        }
        
    }
    
}
