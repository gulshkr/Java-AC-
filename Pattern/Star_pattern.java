package Pattern;
import java.util.*;
public class Star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of line you want to print: ");
        int n = sc.nextInt();
        for(int line =1;line<=n;line++){
            //one line output from inner loop
            for(int star = 1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
