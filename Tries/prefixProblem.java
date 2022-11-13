package Tries;

public class prefixProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        Node(){
            for(int i =0;i<children.length;i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    //Insert function
    public static void insert(String word){  //O(L)  where L is largest size of the word in the String
        Node curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    //find prefix function
    public static void finddPrefix(Node root,String ans){  //O(L) longest word in my trie
        if(root == null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<26;i++){
            if(root.children[i]!=null){
                finddPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};
        for(int i =0;i<arr.length;i++){
            insert(arr[i]);
        }


        root.freq = -1;
        finddPrefix(root, "");
    }
    
}
