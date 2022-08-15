package Arrays;

import java.util.*;
public class Print_max_subarray {
    
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        //start
        for(int i =0;i<numbers.length;i++){
            int start = i;
            //end
            for(int j =i;j<numbers.length;j++){
                int end = j;
                //imp: before starting a new array initialize currSum as 0 otherwise it shows error
                currSum = 0;
                //print the array
                for(int k = start;k<=end;k++){
                    //subarray sum
                    currSum +=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
    
}
