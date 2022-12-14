// for more notes page no - 513
package Tries.Practice;
import java.util.*;
public class longestwordInDictionary {
    public static class Node{
        char data;
        String word;
        boolean isEnd;
        Node[] children;

        public Node(char data){
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    public Node root = new Node('/');
    public String ans = "";

    public void insert(String word){
        Node curr = this.root;
        for(int i = 0;i<word.length();i++){
            int childIdx = word.charAt(i)-'a'; //childIdx = child index
            if(curr.children[childIdx] == null){
                curr.children[childIdx] = new Node(word.charAt(i));
            }

            curr = curr.children[childIdx];
        }

        curr.isEnd = true;
        curr.word = word;
    }

    public void dfs(Node node){
        if(node == null){
            return;
        }
        if(node.word != null){
            if(node.word.length() > ans.length()){
                ans = node.word;
            } else if(node.word.length() == ans.length() && node.word.compareTo(ans)<0){
                ans = node.word;
            }
        }
        for(Node child: node.children){
            if(child!=null && child.word != null){
                dfs(child);
            }
        }
    }

    public String longestWord(String[] words){
        for(String word : words){
            insert(word);
        }
        Node curr = this.root;
        dfs(curr);
        return ans;
    }
    public static void main(String[] args) {
        // we always need to create an object in order to refer to a non-static variable from a static context. Whenever a new instance is created, a new copy of all the non-static variables and methods are created. By using the reference of the new instance, these variables can be accessed.
        longestwordInDictionary res = new longestwordInDictionary();
        String words[] = {"w","wo","wor","worl","world"};
        System.out.println(res.longestWord(words));
        
    }
    
}