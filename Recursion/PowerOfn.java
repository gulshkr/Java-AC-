package Recursion;

public class PowerOfn {
    public static int power(int x,int n){  //X^n
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);  // xnm1 = x and n-1
        // int xn = x*xnm1;
        // return xn;
        //     or
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2,n = 5;
        System.out.println(power(x, n));
    }
}
