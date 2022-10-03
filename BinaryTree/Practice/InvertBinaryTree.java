package BinaryTree.Practice;

public class InvertBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static Node isMirror(Node root){
        if(root==null){
            return root;
        }

        /*do the subtrees */
        Node left = isMirror(root.left);
        Node righ = isMirror(root.right);

        return root;
    }
    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");

        inOrder(root.right);
    }

    

    public static void main(String[] args) {
        
    }
    
}
