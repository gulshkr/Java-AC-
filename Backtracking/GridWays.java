package Backtracking;
//FInd the number of ways to reach from(0,0) cell to (n-1,m-1) in a n*m grid. Aloowed moves are - right or down
public class GridWays {
    public static int girdWays(int i,int j,int n,int m){
        //Base
        if(i==n-1 && j==m-1){ //Condition for last call -- this is when you are one step behind the result
            return 1;
        }else if(i==n || j==n){ // boundary cross condition  -- this is when you are at the result
            return 0;
        }
        
        int w1 = girdWays(i+1, j, n, m);
        int w2 = girdWays(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(girdWays(0, 0, n, m));
    }
    
}
