package Backtracking;

public class FindPermutation {
    public static void findPermutation(String str,String ans){
        int n = str.length();
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            //abcde = we choose c So we have to take c out, for doing that we have to "ab"+"de"= abde by this we can get c
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
    
}
