package Bitmanipulation;

public class powerOf2 {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
    }
    
}
