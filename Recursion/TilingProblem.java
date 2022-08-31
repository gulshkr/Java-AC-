package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n){
        //base choice
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice 
        // int fnm1 = tilingProblem(n-1); //fnm1 = f of n - 1

        // //horizontally
        // int fnm2 = tilingProblem(n-2); //fnm2 = f of n - 2

        // //find total ways
        // int totWays = fnm1 + fnm2;
        // return totWays;
        
        //----------> or you can do it in a single line
        return tilingProblem(n-1) + tilingProblem(n-1);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(4));
    }
    
}
