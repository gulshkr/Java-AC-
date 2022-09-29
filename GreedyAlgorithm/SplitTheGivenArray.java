package GreedyAlgorithm;
import java.util.*;
//Split the given array into k sub-arrays 
public class SplitTheGivenArray {
    static int ans = 1000000;
    static void solve(int a[],int n,int k,int index,int sum,int maxsum){
        if(k==1){
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for(int i =0;i<n;i++){
                sum+=a[i];
            }
            maxsum = Math.max(maxsum,sum);
            ans = Math.min(ans,maxsum);
            return;
        }
        sum = 0;
        for(int i=index;i<n;i++){
            sum+=a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, n, k-1, i+1, sum, maxsum);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 3; //k divivison
        int n = arr.length;  //size of the array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans+" ");
        
    }
    
}
