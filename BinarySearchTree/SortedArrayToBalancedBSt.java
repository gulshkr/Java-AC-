package BinarySearchTree;
//Sorted array to Binary search tree - O(n)
public class SortedArrayToBalancedBSt {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    //preorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //Sorting
    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left=createBST(arr, st,mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;

    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        /*
                    8
                   / \
                  5   11
                / \  /  \
               3  6 10  12
        */

        Node root = createBST(arr, 0, arr.length-1);
        preorder(root); 
    }
    
}
