package Recursion;

public class PowerofnOptimize {
    public static int powerOptimize(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = powerOptimize(x, n/2);
        int halfPowSquare = halfPower*halfPower;

        //if n is odd 
        if(n%2!=0){
            halfPowSquare = x*halfPowSquare;
        }
        return halfPowSquare;
    }
    public static void main(String[] args) {
        int x = 2,n = 5;
        System.out.println(powerOptimize(x, n));
    }
    
}
