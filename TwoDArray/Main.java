package Twodarray;

public class Main {
    //*********for spiral matrix  - this question came in google, amazon, oracle
    // public static void spiralmatrix(int matrix[][]){
    //     int n = matrix.length;
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = n-1;
    //     int endCol = matrix[0].length-1;
    //     while(startRow<=endRow && startCol<=endCol){
    //         //for top
    //         for(int j = startCol;j<=endCol;j++){
    //             System.out.print(matrix[startRow][j]+" ");
    //         }
    //         //for right
    //         for(int i =startRow+1;i<=endRow;i++){
    //             System.out.print(matrix[i][endCol]+" ");
    //         }
    //         //for bottom
    //         for(int j = endCol-1;j<=startCol;j++){
    //             if(startRow==endRow){
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j]+" ");
    //         }
    //         //for left
    //         for(int i = endRow-1;i<=startRow+1;i++){
    //             if(startCol ==endCol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol]+" ");
    //         }
    //         startRow++;
    //         endRow--;
    //         startCol++;
    //         endCol--;
    //     }
    // }

    //**********for diagonal matrix sum amazon google samsung microsoft  T.C - O(n^2)
    // public static int  diagonalMatrix(int matrix[][]){
    //     int sum = 0;
    //     for(int i = 0;i<matrix.length;i++){
    //         for(int j =0;j<=matrix[0].length;j++){
    //             if(i==j){
    //                 sum+=matrix[i][j];
    //             } else if(i+j==matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    //**********optimized diagonal matrix sum  T.C = O(n)
    // public static int diagonalMatrix(int matrix[][]){
    //     int sum = 0;
    //     for(int i =0;i<matrix.length;i++){
    //         sum+=matrix[i][i];
    //         //primary diagonal
    //         if(i!=matrix.length-1-i){
    //             sum+=matrix[i][matrix.length-1-i];
    //         }
    //     }
    //     return sum;
    // }


    //Search in a sorted matrix
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0,col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at ( "+ row +","+ col +")");
                return true;
            } else if(key<matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        // spiralmatrix(matrix);
        // System.out.println(diagonalMatrix(matrix));
        staircaseSearch(matrix, 8);

        
    }
    
}
