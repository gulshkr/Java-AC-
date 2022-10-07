package BinarySearchTree.Practice;
import java.util.*;
//Practice question - 4 - Two Sum BSTs  - means you have given two bst and X now you have to find the x after sum of the two bsts and find out pairs
public class TwoSumBSTs {
    static class Node{
        int data;
        Node left;  //left and right are already null 
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node root1;
    static Node root2;
    static int coutPairs(Node root1,Node root2,int x){
        if(root1 == null || root2 == null){
            return 0;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        Node top1,top2;

        int count = 0;

        while(true){
            while(root1!=null){
                st1.push(root1);
                root1 = root1.left;
            }
            while(root2!=null){
                st2.push(root2);
                root2 = root2.right;
            }

            if(st1.empty() || st2.empty()){
                break;
            }
            top1 = st1.peek();
            top2 = st2.peek();
            if((top1.data+top2.data) == x){
                count++;
                st1.pop();
                st2.pop();
                root1 = top1.right;
                root2 = top2.left;
            }else if((top1.data+top2.data) < x){
                st1.pop();
                root1 = top1.right;
            } else{
                st2.pop();
                root2 = top2.left;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        /*
                       5
                    /    \
                   3      7
                 /  \    /  \
                2    4  6    8

                       
                        10
                      /   \
                     6     15
                   /  \   /  \
                  3    8 11   18

                  x = 16

            output - 3
            The pairs are 
            (5,11) (6,10)  (8,8)      
        */

        root1 = new Node(5);
        root1.left = new Node(3);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right = new Node(7);
        root1.right.right = new Node(8);
        root1.right.left = new Node(6);

        //root2
        root2 = new Node(10);
        root2.left = new Node(6);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right = new Node(15);
        root2.right.right = new Node(18);
        root2.right.left = new Node(11);

        int x = 16;
        System.out.println("Pairs are: "+coutPairs(root1, root2, x));

    }
    
}
