package Pattern;
import java.util.*;
public class Number_pyramid {
    public static void number_pyramid(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number print
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    // public static void number_pyramid(int n){
    //     //outer loop
    //     for(int i = 1;i<=n;i++){
    //         //spaces
    //         for(int j = 1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         //number print
    //         for (int j = 1;j <= i; j++){
                

    //                 System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n or no of rows: ");
        int n = sc.nextInt();
        number_pyramid(n);
    }

}
