package Loop;
import java.util.*;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is a prime");
        } else{
            boolean isPrime = true;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){   // n is  a multiple of i (i not equal to 1 or itslef)
                isPrime = false;
            }
        }

        if(isPrime== true){
            System.out.println("n is  a Prime");
        } else{
            System.out.println(" n is not a prime");
        }
        }
        
    }
    
}
