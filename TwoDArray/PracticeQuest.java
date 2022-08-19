package Twodarray;
import java.util.*;
public class PracticeQuest {
    //Queston - 1 Print the number of 7's that are in the 2d array 
    // public static void NoOf_7(int array[][]){
    //     int count = 0 ;
    //     for(int row =0;row<array.length;row++){
    //         for(int col =0;col<array[0].length;col++){
    //             if(array[row][col]==7){
    //             count++;
    //         }
    //         }
    //     }
    //     System.out.println(count);
    // }
// }


    //Question - 2 Print the sum of the numbers of the 2nd row
    // public static void sumOf2ndrow(int nums[][]){
    //     int sum = 0;
    //     //sum of 2nd row elements
    //         for(int col = 0;col<nums[0].length;col++){
    //             sum+=nums[1][col];
    //         }
    //         System.out.println("sum is: "+sum);
    //     }


    //Question - 3 Write a program to find transpose of a matrix
    public static void transpose(int matrix[][]){
        int row = 2,col=3;
        //transpose the matrix
        int transpose[][] = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        PrintMatrix(transpose);
    }

    //display function
    public static void PrintMatrix(int matrix[][]){
        // to print the matrix
        System.out.println("the matrix is : ");
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Question - 1
        // int array[][] = {{4,7,8},
        //                 {8,8,7}};
        // NoOf_7(array);

        //Question - 2
        // int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // sumOf2ndrow(nums);

        //Question - 3 
        int matrix[][] = {{1,2,3},{4,5,6}};
         
        transpose(matrix);

    }
    
}


