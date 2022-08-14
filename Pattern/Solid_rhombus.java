package Pattern;
import java.util.*;
public class Solid_rhombus {
    public static void solid_rhombus(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
                }   
                //stars
                for(int j = 1;j<=n;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eEnter the value for n or no fo rows: ");
        int n = sc.nextInt();
        solid_rhombus(n);
    }
    
}
