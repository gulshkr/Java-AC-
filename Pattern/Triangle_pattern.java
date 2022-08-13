package Pattern;
import java.util.*;
public class Triangle_pattern {
    public static void zero_one_triangle(int n){
        //outer
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                } else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n or no fo rows : ");
        int n = sc.nextInt();
        zero_one_triangle(n);
    }
    
}
