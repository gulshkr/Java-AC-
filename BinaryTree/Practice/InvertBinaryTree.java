package BinaryTree.Practice;
//Invert binary tree - check whether the mirror of the binary tree are the same
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

    Node root;
    void invert(){
        root = invert(root);
    }

    Node invert(Node root){
        if(root == null){
            return root;
        }

        /*recursive calls */
        Node left = invert(root.left);
        Node right = invert(root.right);

        /*swap the left ans right */
        root.left = right;
        root.right = left;

        return root;
    }

    void print_tree(){
        print_tree(root);
    }

    //Print inorder binary traversla
    void print_tree(Node root){
        if(root == null)
            return;

        print_tree(root.left);
        System.out.print(root.data+" ");

        print_tree(root.right);
    }
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("inorder traversal is: ");
        tree.print_tree();
        System.out.println("");

        // Invert tree
        tree.invert();

        //print inorder traversal
        System.out.println("Inorder traversal : ");
        tree.print_tree();


    }
    
}
