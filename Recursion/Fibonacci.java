package Recursion;

public class Fibonacci {
    public static int fib(int n){
    if(n==0 || n == 1){
        return n;
    }
    int fbnm1 = fib(n-1);  // fbnm1 = fibonacci of n - 1
    int fbnm2 = fib(n-2);  // fbnm1 = fibonacci of n - 2
    int fn = fbnm1 + fbnm2;
    return fn;
}
    public static void main(String[] args) {
        int n = 26;
        System.out.println(fib(n));
        // fib(n);
    }
    
}
