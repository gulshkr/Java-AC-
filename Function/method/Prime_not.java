package Function.method;
import java.util.*;
public class Prime_not {
    //only for n == 2
    // public static boolean isPrime(int n){
    //     //corner cases
    //     //1
    //     if(n==2){
    //         return true;
    //     }
    //     // boolean isPrime = true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){  //completely dividing
    //             // isPrime = false;
    //             // break;
    //             return false;
    //         } 
    //     }
    //     // return isPrime;
    //     return true;
    // }

    //optimized version of prime or not
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){ //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(5));
        primesInRange(20);
        
    }   
}
