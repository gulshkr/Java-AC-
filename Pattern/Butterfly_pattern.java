package Pattern;
import java.util.*;
public class Butterfly_pattern{
    public static void butterfly(int n){
        //1st half
        //outer loop
        for(int i = 1;i<=n;i++){
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        //outer loop
        for(int i =n;i>=1;i--){
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no n or the no of row: ");
        int n = sc.nextInt();
        butterfly(n);
    }
}