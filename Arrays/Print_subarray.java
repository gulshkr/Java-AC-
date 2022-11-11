package Arrays;
import java.util.*;
public class Print_subarray {
    public static void printSubarray(int numbers[]){
        int currSum=0;
        int tp = 0; // total pair
        //start
        for(int i =0;i<numbers.length;i++){
            int start = i;
            //end
            for(int j =i;j<numbers.length;j++){
                int end = j;
                currSum = 0;
                //print the array
                for(int k = start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    currSum +=numbers[k];
                    
                }
                System.out.print(" sum = "+currSum);
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray: "+tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7};
        printSubarray(numbers);
    }
    
}
