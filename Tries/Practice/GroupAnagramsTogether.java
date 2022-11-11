package Tries.Practice;
import java.util.*;
public  class GroupAnagramsTogether {
    static class Node{
        List<String> data;
        Node children[];
        boolean isEnd;

        Node(){
            data = new ArrayList<>();
            children = new Node[26];
            isEnd = false;
        }
    }

    public static Node root;
    static List<List<String>> ans; //List ke andar ek list banaya
    public static List<List<String>> groupAnagrams(String[] strs){
        ans = new ArrayList<>();
        root = new Node();
        for(String word : strs){
            build(word);
        }
        dfs(root);

        return ans;
    }

    public static void build(String s){
        Node temp = root;
        char[] word = s.toCharArray();
        Arrays.sort(word);
        for(char c: word){
            Node child = temp.children[c-'a'];
            if(child == null) temp.children[c-'a'] = new Node();
            temp = temp.children[c-'a'];
        }
        temp.isEnd = true;
        temp.data.add(s);
    }

    public static void dfs(Node rt){
        if(rt.isEnd){
            ans.add(rt.data);
        }
        for(int i =0;i<26;i++){
            if(rt.children[i] != null) dfs(rt.children[i]);
        }
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }
    
}
