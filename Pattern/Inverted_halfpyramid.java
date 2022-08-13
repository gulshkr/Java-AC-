package Pattern;
import java.util.*;
public class Inverted_halfpyramid {
    public static void inverted_half_pyramid(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //inner loop or for spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row or value 'n' : ");
        int n = sc.nextInt();
        inverted_half_pyramid(n);
    }
    
}
