package Pattern;
import java.util.*;
public class Inverted_half_numbers {
    public static void inverted_half_pyramid_no(int n){
        //outer loop
        for(int i = 1;i<=n;i++){
            //inner loop
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row or value 'n' ");
        int n = sc.nextInt();
        inverted_half_pyramid_no(n);
    }
    
}
