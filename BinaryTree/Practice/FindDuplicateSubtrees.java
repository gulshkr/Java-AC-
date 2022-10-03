package BinaryTree.Practice;
import java.util.*;
//Practice question - 4 - Find all Duplicate Subtrees
public class FindDuplicateSubtrees {
    static HashMap<String, Integer> m;
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    static String inorder(Node root){
        if(root == null){
            return "";
        }

        String str = "(";
        str+=inorder(root.left);
        str+=Integer.toString(root.data);
        str+=inorder(root.right);
        str+=")";

        if(m.get(str)!=null && m.get(str)==1){
            System.out.print(root.data+" ");
        }
        if(m.containsKey(str)){
            m.put(str,  m.get(str)+1);
        } else{
            m.put(str, 1);
        }
        return str;
    }
    public static void duplicateSubtree(Node root){
        m = new HashMap<>();
        inorder(root);
    }

    public static void main(String[] args) {
        /*
        input:
                   1
                  / \
                 4   3
                /   / \
               3   4   3
                  /
                 3
        output - 4-3 , 3
         */
        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);

        duplicateSubtree(root);
    }
    
}
