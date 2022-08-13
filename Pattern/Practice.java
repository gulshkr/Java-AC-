package Pattern;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st Hollow rectangle pattern
        // System.out.print("enter the number of row and column: ");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // //for row
        // for(int row=1;row<=n;row++){
        //     //for column
        //     for(int column = 1;column<=m;column++){
        //         if(row==1 || row==n || column==1 || column==n){
        //         System.out.print("*");
        //         } else{
        //         System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //2nd Inverted and rotated half-pyramid pattern
        System.out.print("Enter the rwo and column: ");
        int n = sc.nextInt();
        //for outer loop
        for(int line = 0;line<n;line++){
            //for inner loop for spaces
            for(int space = 2*(n-line);space>=0;space--){
                System.out.print(" ");
            }  
            //for inner loop fro star
            for(int star = 0;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
