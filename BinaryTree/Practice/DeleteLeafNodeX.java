package BinaryTree.Practice;
//Practice question - 3 - Delete a leaf nodes with values as X  (inorder)input - 33213 output - 321
public class DeleteLeafNodeX {
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

    static Node deleteLeafNode(Node root,int x){  //x is for checking root.data to left and right
        if(root == null){
            return null;
        }
        root.left = deleteLeafNode(root.left,x);
        root.right = deleteLeafNode(root.right,x);

        if(root.data == x && root.left == null && root.right == null){
            return null;
        }
        return root;
    }

    // for checking if leaf node is deleted or not we will use inorder traversal
    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
         /*
                     1                1
                   /  \              /
                  3    3    =>      3
                / \                  \
               3  2                   2
        */
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        inorder(root);
        System.out.println();
        deleteLeafNode(root, 3);
        System.out.println("inoerder traversal after delete: ");
        inorder(root);

    }
    
}
