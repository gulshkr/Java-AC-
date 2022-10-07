package BinarySearchTree.Practice;
//Practice question - 2 - Find the closest element In Binart Search tree
public class FindClosestElement {
    static int  min_diff,min_diff_key;
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void closestElement(Node root,int k){
        if(root == null){
            return;
        }
        if(root.data == k){
            min_diff = k;
            return;
        }

        if(min_diff>Math.abs(root.data-k)){
            min_diff = Math.abs(root.data-k);
            min_diff_key = root.data;
        }

        if(k<root.data){
            closestElement(root.left, k);
        } else{
            closestElement(root.right, k);
        }
    }

    static int maxDiff(Node root,int k){
        min_diff = 9999999;
        min_diff_key = -1;
        closestElement(root, k);
        return min_diff_key;
    }

    public static void main(String[] args) {
        /*
                     8
                   /   \
                  5     11
                 / \      \
                3   6     20
        */
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int k = 5;
        System.out.print(maxDiff(root, k));


    }
    
}
