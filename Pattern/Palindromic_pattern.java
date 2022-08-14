package Pattern;
import java.util.*;
public class Palindromic_pattern {
    public static void palindromic_pattern(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j =i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            //number
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n or no of rows: ");
        int n = sc.nextInt();
        palindromic_pattern(n);
    }
    
}
