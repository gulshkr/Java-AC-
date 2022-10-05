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

    public static Node createBST(int arr[],int st,int end){
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left=createBST(arr, st,mid-1);
        root.right = createBST(arr, mid+1, end);

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
    }
    
}
