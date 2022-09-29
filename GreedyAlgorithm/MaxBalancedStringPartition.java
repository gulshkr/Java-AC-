package GreedyAlgorithm;
import java.util.*;
//Maximum Balanced string - for more notes page no 357
public class MaxBalancedStringPartition {
    static int BalancedPartition(String str, int n){
        int l =0,r = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(str.charAt(i)=='R'){
                r++;
            } else if(str.charAt(i)=='L'){
                l++;
            } if(r == l){
                ans++;
            }

        }
        return ans;
    }    
    public static void main(String[] args) {
        // String str = "LRRRRLLRLLRL";
        String str = "LRLRLRLRLRLRLRRL";
        int n = str.length();
        System.out.println(BalancedPartition(str, n));
    }
}
