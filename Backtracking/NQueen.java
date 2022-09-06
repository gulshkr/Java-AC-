package Backtracking;

public class NQueen {
    //For reference please check notes page no 183 and 184
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i =row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][],int row){
        //Base -- always see the base case through the parameter
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1); //function call (Recursion)
                board[row][j]='X';   //backtracking step - hume queen ko remove bhi toh krna padega isliye backtrack krke remove krenge
            }
            
        }
    }

    //Print function
    public static void printBoard(char board[][]){
        System.out.println("-------chess Board------");
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
    }
    
}
