package Arrays;
import java.util.*;
public class Print_max_subarray_sum {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i =0;i<numbers.length;i++){
            int start = i;
            //end
            for(int j =i;j<numbers.length;j++){
                int end = j;
                //imp: before starting a new array initialize currSum as 0 otherwise it shows error
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        } 
        System.out.println("max sum is = " + maxSum);  
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
    
}
