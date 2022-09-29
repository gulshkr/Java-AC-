package GreedyAlgorithm;
import java.util.*;
//Lexicographically smallest strign of length N and sum k. - We have two integers N and K. the task is to print the lexicographically smallest string of length N consisting of Lower-case English alphabets such that the sum of the characters of the string equals to K where 'a'-1 'b' - 2, ...'z' - 26 || input - N = 5, K - 42  - output - aaamz
public class LexicographicallySmallest {
    public static char[] lexo_small(int n,int k){
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for(int i = n-1;i>=0;i--){
            k = k-i;
            if(k>=0){
                if(k>=26){
                    arr[i]='z';
                    k = k-26;
                }else{
                    arr[i] = (char)(k+97-1);
                    k = k-arr[i]-'a'+1;
                }
            }else{
                break;
            }
            k=k+i;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n =5,k = 42;
        char arr[] = lexo_small(n, k);
        System.out.println(new String(arr));
        
    }
    
}
