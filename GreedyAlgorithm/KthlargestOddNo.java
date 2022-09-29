package GreedyAlgorithm;
import java.util.*;
//Kth largest odd no - for more notes page no 359
public class KthlargestOddNo {
    static int kthLargestOddNo(int range[],int K){
        
        if(K<=0){
            return 0;
        }
        int L = range[0];
        int R = range[1];

        if((R&1)>0){
            int count = (int) Math.ceil((R-L+1)/2);
            if(K>count){
                return 0;
            } else{
                return (R-2*K+2);
            }
        }else{
            int count = (R-L+1)/2;
            if(K>count){
                return 0;
            } else{
                return (R-2*K+1);
            }
        }
        
    }

    public static void main(String[] args) {
        int []Range = {-10,10};
        int K = 1;
        System.out.println(kthLargestOddNo(Range, K));
    }

    
}
