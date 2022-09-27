package GreedyAlgorithm;
import java.util.*;
//Min Absolute Difference pairs - Given two arrays A and B of equal length n.Pair each element of array A to an element in array B, such that Sum S of absolute differences of all pairs is minimum. A = [1,2,3] B = [2,1,3] ans = 0
public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i =0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolute diff is "+minDiff);
    }
    
}
