package Pattern;
import java.util.*;
public class Inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of line you want to print for pattern:- ");
        int n = sc.nextInt();
        //for line
        for(int line = 1;line<=n;line++){
            //for star
            for(int star = 1;star<=(n-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
