package Twodarray;
import java.util.*;
public class DiagonalMatrix {
    public static int diagonalMatrix(int nums[][]){
        int sum =0;
        //this is not optimized as the time complexity is O(n^2)
        //row
        // for(int i = 0;i<nums.length;i++){
            //column
        //     for(int j = 0;j<nums[0].length;j++){
        //         if(i==j){
        //             sum+=nums[i][j];
        //         } else if(i+j == nums.length-1){
        //             sum+=nums[i][j];
        //         }
        //     }
        // }

        //this is optimized one T.C - O(n)
        for(int i =0;i<nums.length;i++){
            //primary diagonal
            sum+=nums[i][i];
            //secondary diagonal
            if(i!=nums.length-1-i){
                sum+=nums[i][nums.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    
        System.out.println(diagonalMatrix(nums));
                        
        
    }
    
}
