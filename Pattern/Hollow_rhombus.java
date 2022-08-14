package Pattern;
import java.util.*;
public class Hollow_rhombus {
    public static void hollow_rhombus(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j = 1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n or no of rows: ");
        int n = sc.nextInt();
        hollow_rhombus(n);
    }
    
}
