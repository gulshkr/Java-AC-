package BinarySearchTree;

import java.util.ArrayList;

public class Merge2BST {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    //inorder traversal
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }
    //Ceate a BST
    public static Node createBST(ArrayList<Integer> arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    //Merge
    public static Node mergeBSTs(Node root1,Node root2){
        //Step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        //Step3 - merge
        int i = 0,j =0;
        ArrayList<Integer> finalArray = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            } else {
                finalArray.add(arr2.get(j));
                j++;
            }

        }

        while(i<arr1.size()){
            finalArray.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }

        //Step - 4- sorted arraylist - Balanced BST
        return createBST(finalArray, 0, finalArray.size()-1);
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
    
    public static void main(String[] args) {
        /*
                2
              /  \
             1    4
        */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
                9
              /  \
             3    12
        */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        //O(n+m) -> linear

        /*
                   3
                 /   \
                1    9
                 \  /  \
                 2  4   12

            ans = Final result BSt after merge
        */

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
    
}
